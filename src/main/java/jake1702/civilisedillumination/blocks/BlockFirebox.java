package jake1702.civilisedillumination.blocks;

import jake1702.civilisedillumination.CivilisedIllumination;
import jake1702.civilisedillumination.misc.ModStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFirebox extends Block {
    public BlockFirebox() {
        super(Material.rock);

        this.setBlockTextureName(CivilisedIllumination.modNamespace + ModStrings.stringFirebox);
        this.setBlockName(ModStrings.stringFirebox);
        this.setCreativeTab(CivilisedIllumination.creativeTab);
    }
}
