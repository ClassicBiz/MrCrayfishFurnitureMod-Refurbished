package com.mrcrayfish.furniture.refurbished.computer.client.widget;

import com.mrcrayfish.furniture.refurbished.client.gui.IOverrideGetEntry;
import com.mrcrayfish.furniture.refurbished.client.util.ScreenHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.ObjectSelectionList;
import net.minecraft.util.Mth;
import org.lwjgl.glfw.GLFW;

/**
 * Author: MrCrayfish
 */
public class ComputerSelectionList<E extends ObjectSelectionList.Entry<E>> extends ObjectSelectionList<E> implements IOverrideGetEntry<E>
{
    private static final int OUTLINE_SIZE = 1;

    protected int contentPadding = 2;
    protected int scrollBarWidth = 6;
    protected int outlineColour = 0xFF47403E;
    protected int backgroundColour = 0xFF262626;
    protected int scrollBarColour = 0xFF47403E;
    protected int scrollBarHighlightColour = 0xFF332E2D;
    protected int itemSpacing = 2;
    protected boolean scrolling;

    public ComputerSelectionList(int width, int height, int x, int y, int itemHeight)
    {
        super(Minecraft.getInstance(), width, height, y, itemHeight);
        this.setPosition(x, y);
    }

    public void setPosition(int x, int y)
    {
        this.setPosition(x, y);
        this.setSize(this.width, this.height);
    }

    public void setContentPadding(int contentPadding)
    {
        this.contentPadding = contentPadding;
    }

    public void setScrollBarWidth(int scrollBarWidth)
    {
        this.scrollBarWidth = scrollBarWidth;
    }

    public void setOutlineColour(int outlineColour)
    {
        this.outlineColour = outlineColour;
    }

    public void setBackgroundColour(int backgroundColour)
    {
        this.backgroundColour = backgroundColour;
    }

    public void setScrollBarColour(int scrollBarColour)
    {
        this.scrollBarColour = scrollBarColour;
    }

    public void setScrollBarHighlightColour(int scrollBarHighlightColour)
    {
        this.scrollBarHighlightColour = scrollBarHighlightColour;
    }

    public void setItemSpacing(int itemSpacing)
    {
        this.itemSpacing = itemSpacing;
    }

    @Override
    public boolean isMouseOver(double mouseX, double mouseY)
    {
        return mouseY >= this.getY() && mouseY <= this.getY() + this.getHeight() && mouseX >= this.getX() && mouseX <= this.getX() + this.getWidth();
    }

    @Override
    public int getRowWidth()
    {
        return this.getRowRight() - this.getRowLeft();
    }

    @Override
    public int getRowLeft()
    {
        return this.getX() + OUTLINE_SIZE + this.contentPadding;
    }

    @Override
    public int getRowRight()
    {
        if(this.getMaxScroll() > 0)
        {
            return this.getX() + this.getWidth() - this.contentPadding - OUTLINE_SIZE - this.contentPadding - this.scrollBarWidth - this.contentPadding - OUTLINE_SIZE;
        }
        return this.getX() + this.getWidth() - this.contentPadding - OUTLINE_SIZE;
    }

    @Override
    protected int getRowTop(int index)
    {
        return this.getY() + OUTLINE_SIZE + this.contentPadding - (int) this.getScrollAmount() + index * this.itemHeight + index * this.itemSpacing;
    }

    @Override
    protected int getScrollbarPosition()
    {
        return this.getX() + this.getWidth() - this.scrollBarWidth - this.contentPadding - OUTLINE_SIZE;
    }

    private int getScrollbarHeight()
    {
        int scrollAreaHeight = this.getScrollAreaHeight();
        int scrollBarHeight = (int) (Mth.square(scrollAreaHeight) / (float) this.getMaxPosition());
        return Mth.clamp(scrollBarHeight, 32, scrollAreaHeight);
    }

    public int getScrollBottom()
    {
        return (int) this.getScrollAmount() - this.height;
    }

    public int getScrollAreaHeight()
    {
        return this.height - OUTLINE_SIZE * 2 - this.contentPadding * 2;
    }

    public int getScrollAreaTop()
    {
        return this.getY() + OUTLINE_SIZE + this.contentPadding;
    }

    @Override
    public int getMaxScroll()
    {
        return Math.max(0, this.getMaxPosition() - this.height + this.contentPadding * 2 + OUTLINE_SIZE * 2);
    }

    @Override
    protected int getMaxPosition()
    {
        return this.getItemCount() * (this.itemHeight + this.itemSpacing) - this.itemSpacing;
    }

    @Override
    public void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTick)
    {
        // Draw outlines and background
        graphics.fill(this.getX(), this.getY(), this.getX() + this.getWidth(), this.getY() + this.getHeight(), this.outlineColour);
        graphics.fill(this.getX() + 1, this.getY() + 1, this.getX() + this.getWidth() - 1, this.getY() + this.getHeight() - 1, this.backgroundColour);

        // Draw items
        graphics.enableScissor(this.getRowLeft() - 1, this.getY() + 1, this.getRowRight() + 1, this.getY() + this.getHeight() - 1);
        this.renderList(graphics, mouseX, mouseY, partialTick);
        graphics.disableScissor();

        // Only draw scroll bar if enough items
        int maxScroll = this.getMaxScroll();
        if(maxScroll > 0)
        {
            // Draw divider between items and scroll bar
            graphics.fill(this.getScrollbarPosition() - this.contentPadding - 1, this.getY() + 1, this.getScrollbarPosition() - this.contentPadding, this.getY() + this.getHeight() - 1, this.outlineColour);

            // Draw scroll bar
            int scrollBarStart = this.getScrollbarPosition();
            int scrollBarEnd = scrollBarStart + this.scrollBarWidth;
            int scrollBarHeight = this.getScrollbarHeight();
            int scrollBarTop = (int) (this.getScrollAreaTop() + (this.getScrollAreaHeight() - this.getScrollbarHeight()) * (this.getScrollAmount() / maxScroll));
            int scrollBarColour = ScreenHelper.isMouseWithinBounds(mouseX, mouseY, scrollBarStart, scrollBarTop, this.scrollBarWidth, scrollBarHeight) ? this.scrollBarHighlightColour : this.scrollBarColour;
            graphics.fill(scrollBarStart, scrollBarTop, scrollBarEnd, scrollBarTop + scrollBarHeight, scrollBarColour);
        }
    }

    @Override
    protected void renderList(GuiGraphics graphics, int mouseX, int mouseY, float partialTick)
    {
        int rowLeft = this.getRowLeft();
        int rowWidth = this.getRowWidth();
        int rowHeight = this.itemHeight;
        int rowCount = this.getItemCount();

        // For efficiency, find the index to start drawing based on scroll amount
        int startIndex = Math.max(0, (int) ((this.getScrollAmount() - this.contentPadding) / (rowHeight + this.itemSpacing)));
        for(int i = startIndex; i < rowCount; i++)
        {
            int rowTop = this.getRowTop(i);
            if(rowTop <= this.getY() + this.getHeight())
            {
                this.renderItem(graphics, mouseX, mouseY, partialTick, i, rowLeft, rowTop, rowWidth, rowHeight);
                continue;
            }
            // Break if the item is below the content area. Also stops drawing subsequent items.
            break;
        }

    }

    @Override
    protected void renderSelection(GuiGraphics graphics, int top, int rowWidth, int itemHeight, int outlineColour, int innerColour)
    {
        int start = this.getRowLeft();
        int end = this.getRowRight();
        graphics.fill(start - 1, top - 1, end + 1, top + itemHeight + 1, outlineColour);
        //graphics.fill(start + 1, top - 1, end - 1, top + itemHeight + 1, innerColour);
    }

    @Override
    protected void updateScrollingState(double mouseX, double mouseY, int button)
    {
        this.scrolling = button == GLFW.GLFW_MOUSE_BUTTON_LEFT
                && ScreenHelper.isMouseWithinBounds(mouseX, mouseY, this.getScrollbarPosition(), this.getScrollAreaTop(), 6, this.getScrollAreaHeight());
    }

    @Override
    public boolean mouseDragged(double $$0, double $$1, int button, double deltaX, double deltaY)
    {
        if(button == GLFW.GLFW_MOUSE_BUTTON_LEFT)
        {
            if(this.getFocused() != null && this.isDragging() && this.getFocused().mouseDragged($$0, $$1, button, deltaX, deltaY))
            {
                return true;
            }
            if(this.scrolling)
            {
                double unitsPerScroll = (double) this.getMaxScroll() / (this.getScrollAreaHeight() - this.getScrollbarHeight());
                this.setScrollAmount(this.getScrollAmount() + deltaY * unitsPerScroll);
                return true;
            }
        }
        return false;
    }

    @Override
    public E getEntry(double mouseX, double mouseY)
    {
        if(ScreenHelper.isMouseWithinBounds(mouseX, mouseY, this.getX(), this.getY(), this.getWidth(), this.getHeight()))
        {
            int rowLeft = this.getRowLeft();
            int rowWidth = this.getRowWidth();
            int rowHeight = this.itemHeight;
            int rowCount = this.getItemCount();
            int startIndex = Math.max(0, (int) ((this.getScrollAmount() - this.contentPadding) / (rowHeight + this.itemSpacing)));
            for(int i = startIndex; i < rowCount; i++)
            {
                int rowTop = this.getRowTop(i);
                if(rowTop <= this.getY() + this.getHeight())
                {
                    if(ScreenHelper.isMouseWithinBounds(mouseX, mouseY, rowLeft, rowTop, rowWidth, rowHeight))
                    {
                        return this.getEntry(i);
                    }
                    continue;
                }
                break;
            }
        }
        return null;
    }
}
