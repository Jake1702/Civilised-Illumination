package jake1702.civilisedillumination.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import jake1702.civilisedillumination.items.itemblocks.ItemBlockFirebox;
import jake1702.civilisedillumination.misc.ModStrings;

public class ModBlocks {

    public static BlockFirebox blockFirebox;

    public static void registerBlocks() {
        blockFirebox = new BlockFirebox();
        GameRegistry.registerBlock(blockFirebox, ItemBlockFirebox.class, ModStrings.stringFirebox);
    }
}
