package io.github.woodiertexas.architecture_extensions;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchitectureExtensions implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Architecture Extensions");

	public static final Block STONE_BRICK_ARCH = new Block(QuiltBlockSettings.of(Material.STONE).strength(4f).nonOpaque());
	public static final Block STONE_BRICK_PILLAR = new Block(QuiltBlockSettings.of(Material.STONE).strength(4f).nonOpaque());

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {} v{}!", mod.metadata().name(), mod.metadata().version().raw());

		Registry.register(Registry.BLOCK, new Identifier("architecture_extensions", "stone_brick_arch"), STONE_BRICK_ARCH);
		Registry.register(Registry.ITEM, new Identifier("architecture_extensions", "stone_brick_arch"),
				new BlockItem(STONE_BRICK_ARCH, new QuiltItemSettings().group(ItemGroup.DECORATIONS)));

		Registry.register(Registry.BLOCK, new Identifier("architecture_extensions", "stone_brick_pillar"), STONE_BRICK_PILLAR);
		Registry.register(Registry.ITEM, new Identifier("architecture_extensions", "stone_brick_pillar"),
				new BlockItem(STONE_BRICK_PILLAR, new QuiltItemSettings().group(ItemGroup.DECORATIONS)));
	}
}
