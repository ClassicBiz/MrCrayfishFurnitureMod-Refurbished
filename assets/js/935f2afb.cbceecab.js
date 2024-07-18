"use strict";(self.webpackChunkdocumentation=self.webpackChunkdocumentation||[]).push([[581],{5610:e=>{e.exports=JSON.parse('{"pluginId":"default","version":"current","label":"Next","banner":null,"badge":false,"noIndex":false,"className":"docs-version-current","isLast":true,"docsSidebars":{"crafttweakerSidebar":[{"type":"link","label":"Introduction","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/","docId":"crafttweaker/index","unlisted":false},{"type":"link","label":"Your First Script","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/your-first-script","docId":"crafttweaker/your-first-script","unlisted":false},{"type":"category","label":"Recipe Types","collapsible":true,"collapsed":false,"className":"red","items":[{"type":"link","label":"Cutting Board (Combining)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/cutting_board_combining","docId":"crafttweaker/recipes/cutting_board_combining","unlisted":false},{"type":"link","label":"Cutting Board (Slicing)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/cutting_board_slicing","docId":"crafttweaker/recipes/cutting_board_slicing","unlisted":false},{"type":"link","label":"Freezer (Solidifying)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/freezer_solidifying","docId":"crafttweaker/recipes/freezer_solidifying","unlisted":false},{"type":"link","label":"Frying Pan (Frying)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/frying_pan_frying","docId":"crafttweaker/recipes/frying_pan_frying","unlisted":false},{"type":"link","label":"Grill (Cooking)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/grill_cooking","docId":"crafttweaker/recipes/grill_cooking","unlisted":false},{"type":"link","label":"Microwave (Heating)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/microwave_heating","docId":"crafttweaker/recipes/microwave_heating","unlisted":false},{"type":"link","label":"Oven (Baking)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/oven_baking","docId":"crafttweaker/recipes/oven_baking","unlisted":false},{"type":"link","label":"Toaster (Heating)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/toaster_heating","docId":"crafttweaker/recipes/toaster_heating","unlisted":false},{"type":"link","label":"Workbench (Constructing)","href":"/MrCrayfishFurnitureMod-Refurbished/docs/crafttweaker/recipes/workbench_constructing","docId":"crafttweaker/recipes/workbench_constructing","unlisted":false}],"href":"/MrCrayfishFurnitureMod-Refurbished/docs/category/recipe-types"}],"datapackSidebar":[{"type":"link","label":"index","href":"/MrCrayfishFurnitureMod-Refurbished/docs/datapack/","docId":"datapack/index","unlisted":false},{"type":"link","label":"types","href":"/MrCrayfishFurnitureMod-Refurbished/docs/datapack/types","docId":"datapack/types","unlisted":false}],"addonSidebar":[{"type":"link","label":"Getting Started","href":"/MrCrayfishFurnitureMod-Refurbished/docs/addons/","docId":"addons/index","unlisted":false},{"type":"category","label":"Electricity System","collapsible":true,"collapsed":true,"className":"red","items":[{"type":"link","label":"Introduction","href":"/MrCrayfishFurnitureMod-Refurbished/docs/addons/electricity_system/","docId":"addons/electricity_system/index","unlisted":false},{"type":"category","label":"Create an Electricity Block","collapsible":true,"collapsed":true,"className":"red","items":[{"type":"link","label":"Using Prebuilt Classes","href":"/MrCrayfishFurnitureMod-Refurbished/docs/addons/electricity_system/new_block/prebuilt_classes","docId":"addons/electricity_system/new_block/prebuilt_classes","unlisted":false},{"type":"link","label":"Custom Implementation","href":"/MrCrayfishFurnitureMod-Refurbished/docs/addons/electricity_system/new_block/custom_implementation","docId":"addons/electricity_system/new_block/custom_implementation","unlisted":false}],"href":"/MrCrayfishFurnitureMod-Refurbished/docs/category/create-an-electricity-block"}],"href":"/MrCrayfishFurnitureMod-Refurbished/docs/category/electricity-system"},{"type":"category","label":"Computer Programs","collapsible":true,"collapsed":true,"className":"red","items":[{"type":"link","label":"Introduction","href":"/MrCrayfishFurnitureMod-Refurbished/docs/addons/computer_programs/","docId":"addons/computer_programs/index","unlisted":false},{"type":"link","label":"Create a Computer Program","href":"/MrCrayfishFurnitureMod-Refurbished/docs/addons/computer_programs/create_program","docId":"addons/computer_programs/create_program","unlisted":false}],"href":"/MrCrayfishFurnitureMod-Refurbished/docs/category/computer-programs"}]},"docs":{"addons/computer_programs/create_program":{"id":"addons/computer_programs/create_program","title":"Creating a Computer Program","description":"The API for computer programs is intentionly simple and very open ended. The API only offers to ability to register your program and provide a simple GUI interface on the client. It is up to you to write your own code if you want to do anything advanced, like retrieving data from the server side with packets. - MrCrayfish","sidebar":"addonSidebar"},"addons/computer_programs/index":{"id":"addons/computer_programs/index","title":"Introduction","description":"The Computer in MrCrayfish\'s Furniture Mod is a block that opens a GUI that imitates a simple computer, which includes a desktop-like interface and programs. For addon developers, yet fairly simple, support is available to register your own custom programs so they are available on the Computer.","sidebar":"addonSidebar"},"addons/electricity_system/index":{"id":"addons/electricity_system/index","title":"Introduction","description":"Electricity is a new system introduced in MrCrayfish\'s Furniture Mod: Refurbished. It is used to provide power to appliances and other electronics, like the Computer and Stove. Blocks are connected to each other by an \\"invisible\\" network, only visible when a player is holding Wrench. Each electricity block contains a node, which can be linked to other nodes to create a connection. The connection allows for an electric current to be carried between blocks. Connections can be created, again, using a Wrench.","sidebar":"addonSidebar"},"addons/electricity_system/new_block/custom_implementation":{"id":"addons/electricity_system/new_block/custom_implementation","title":"Custom Implementation","description":"This option is only recommended if you need to implement the electricity system into an existing block entity class and you can\'t use one of the prebuilt classes, or you want full control of everything. Ensure you follow all the steps carefully to avoid implementing the methods and handling syncing incorrectly.","sidebar":"addonSidebar"},"addons/electricity_system/new_block/prebuilt_classes":{"id":"addons/electricity_system/new_block/prebuilt_classes","title":"Using Prebuilt Classes","description":"MrCrayfish\'s Furniture Mod: Refurbished provides many prebuilt classes that you can extend to avoid common boilerplate code. You\'ll need to decide whether you are going to create a Module or a Source. A Module is an electricity block that recieves electrical power (like the Computer), while a Source is an electricity block (like the Electricity Generator) that produces and provides electrical power to modules.","sidebar":"addonSidebar"},"addons/index":{"id":"addons/index","title":"Introduction","description":"Creating an addon requires that you have a good understanding of Java and creating Minecraft mods. The tutorials in this section will not cover basic topics like setting up development environments, and adding new items/blocks into the game. You should already understand that before proceeding.","sidebar":"addonSidebar"},"crafttweaker/index":{"id":"crafttweaker/index","title":"CraftTweaker","description":"From the description of CraftTweaker","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/cutting_board_combining":{"id":"crafttweaker/recipes/cutting_board_combining","title":"Cutting Board (Combining)","description":"Combining is new system introduced in MrCrayfish\'s Furniture Mod: Refurbished. It allows the player to stack items on a Cutting Board to craft a new item. The best way to think about this recipe is creating a sandwich, you start by placing a slice of bread, then layer your ingredients, and then finalise it by placing another slice of bread on the top.","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/cutting_board_slicing":{"id":"crafttweaker/recipes/cutting_board_slicing","title":"Cutting Board (Slicing)","description":"Slicing is system in MrCrayfish\'s Furniture Mod: Refurbished that allows the player to slice an item on a Cutting Board with a Knife. This recipe can be used to break down an item into multiple items, like slicing a pizza into multiple slices.","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/freezer_solidifying":{"id":"crafttweaker/recipes/freezer_solidifying","title":"Freezer (Solidifying)","description":"Solidifying/Freezing is a feature of the Fridge in MrCrayfish\'s Furniture Mod: Refurbished. It can be used by the player to freeze an item, like converting water into ice. The Freezer requires electrical power in order for it to function.","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/frying_pan_frying":{"id":"crafttweaker/recipes/frying_pan_frying","title":"Frying Pan (Frying)","description":"The Frying Pan is a new block in the MrCrayfish\'s Furniture Mod: Refurbished and it allows you to fry food. It is placed on top of a powered Stove. Items need to be flipped half way through the cooking process with a Spatula. Along with the frying pan comes the new frying pan recipe type so you can add custom recipes. The Stove that heats the Frying Pan requires electrical power in order for it to function.","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/grill_cooking":{"id":"crafttweaker/recipes/grill_cooking","title":"Grill (Cooking)","description":"The Grill is a block that allows the player to cook up two four items at a time. It is \\"powered\\" by placing charcoal into the block. Similar to the Frying Pan, half way through the cooking process, the items will need to be flipped with a Spatula. Items are cooked independantly from others.","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/microwave_heating":{"id":"crafttweaker/recipes/microwave_heating","title":"Microwave (Heating)","description":"The Microwave is a block that allows you to heat items. It acts very similar to a furnace, but does not inherit the recipes. The Microwave requires electrical power in order for it to function. It currently has limited recipes in the base mod.","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/oven_baking":{"id":"crafttweaker/recipes/oven_baking","title":"Oven (Baking)","description":"The Oven (a part of the Stove block) allows you to bake items. It has the ability to bake up to three different items simultaneously. They are also baked independantly, so it doesn\'t matter it another item is already half way baked when you add it into the Oven.","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/toaster_heating":{"id":"crafttweaker/recipes/toaster_heating","title":"Toaster (Heating)","description":"The Toaster is block that allows a player to heat/cook an item. It can cook up to two items at a time. The toaster will cook for the duration of the item with the maximum cook time, regardless if the other takes a shorter amount of time. The toaster requires electrical power and is activated by sneaking and interacting (right click).","sidebar":"crafttweakerSidebar"},"crafttweaker/recipes/workbench_constructing":{"id":"crafttweaker/recipes/workbench_constructing","title":"Workbench (Constructing)","description":"The Workbench is a new crafting system introduced in MrCrayfish\'s Furniture Mod: Refurbished. It is the new method of constructing all furniture in the mod. Unlike the crafting table, the workbench doesn\'t work of a crafting grid, it instead simple requires materials be present in the player inventory. Materials can be any number of items with support for an amount. Recipes can also be the exact same without conflicting. The Workbench requires electrical power in order for it to function.","sidebar":"crafttweakerSidebar"},"crafttweaker/your-first-script":{"id":"crafttweaker/your-first-script","title":"Your First Script","description":"\u26a0 This tutorial assumes you know the basics of ZenScript. You can learn more at CraftTweakers documentation.","sidebar":"crafttweakerSidebar"},"datapack/index":{"id":"datapack/index","title":"index","description":"","sidebar":"datapackSidebar"},"datapack/types":{"id":"datapack/types","title":"types","description":"","sidebar":"datapackSidebar"}}}')}}]);