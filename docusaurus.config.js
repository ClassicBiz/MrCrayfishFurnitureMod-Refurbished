// @ts-check
// `@type` JSDoc annotations allow editor autocompletion and type checking
// (when paired with `@ts-check`).
// There are various equivalent ways to declare your Docusaurus config.
// See: https://docusaurus.io/docs/api/docusaurus-config

import {themes as prismThemes} from 'prism-react-renderer';

/** @type {import('@docusaurus/types').Config} */
const config = {
  title: 'Documentation',
  tagline: 'Dinosaurs are cool',
  favicon: 'img/favicon.ico',

  // Set the production url of your site here
  url: 'https://mrcrayfish.github.io/',
  // Set the /<baseUrl>/ pathname under which your site is served
  // For GitHub pages deployment, it is often '/<projectName>/'
  baseUrl: '/MrCrayfishFurnitureMod-Refurbished/',

  // GitHub pages deployment config.
  // If you aren't using GitHub pages, you don't need these.
  organizationName: 'mrcrayfish', // Usually your GitHub org/user name.
  projectName: 'MrCrayfishFurnitureMod-Refurbished', // Usually your repo name.
  deploymentBranch: 'documentation-deployment',
  trailingSlash: false,

  onBrokenLinks: 'throw',
  onBrokenMarkdownLinks: 'warn',

  // Even if you don't use internationalization, you can use this field to set
  // useful metadata like html lang. For example, if your site is Chinese, you
  // may want to replace "en" with "zh-Hans".
  i18n: {
    defaultLocale: 'en',
    locales: ['en'],
  },

  presets: [
    [
      'classic',
      /** @type {import('@docusaurus/preset-classic').Options} */
      ({
        docs: {
          sidebarPath: './sidebars.js',
          editUrl: 'https://github.com/MrCrayfish/MrCrayfishFurnitureMod-Refurbished/tree/documentation',
        },
        theme: {
          customCss: './src/css/custom.css',
        },
      }),
    ],
  ],

  themeConfig:
    /** @type {import('@docusaurus/preset-classic').ThemeConfig} */
    ({
      // Replace with your project's social card
      image: 'img/docusaurus-social-card.jpg',
      navbar: {
        title: 'Documentation',
        logo: {
          alt: 'MrCrayfish\'s Furniture Mod Logo',
          src: 'img/logo.png',
        },
        items: [
          {
            type: 'docSidebar',
            sidebarId: 'crafttweakerSidebar',
            position: 'left',
            label: 'CraftTweaker',
          },
          {
            type: 'docSidebar',
            sidebarId: 'datapackSidebar',
            position: 'left',
            label: 'Datapack',
          },
          {
            href: 'https://github.com/MrCrayfish/MrCrayfishFurnitureMod-Refurbished/tree/documentation',
            label: 'GitHub',
            position: 'right',
          },
        ],
      },
      footer: {
        style: 'dark',
        links: [
          {
            title: 'Community',
            items: [
              {
                label: 'Discord',
                href: 'https://discord.gg/mrcrayfish',
              },
              {
                label: 'Twitter',
                href: 'https://twitter.com/mrcrayfish',
              },
            ],
          },
        ],
        copyright: `Copyright © ${new Date().getFullYear()} MrCrayfish. Documentation licensed under CC BY 4.0. Built with Docusaurus.`,
      },
      prism: {
        theme: prismThemes.github,
        darkTheme: prismThemes.dracula,
      },
    }),
};

export default config;
