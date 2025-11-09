package jake1702.civilisedillumination.items.itemblocks;

import jake1702.civilisedillumination.CivilisedIllumination;
import jake1702.civilisedillumination.misc.EnumFirebox;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockFirebox extends ItemBlock {
    public ItemBlockFirebox(Block block) {
        super(block);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public int getMetadata (int meta) {
        return meta;
    }

    @Override
    public String getUnlocalizedName (ItemStack stack) {
        EnumFirebox firebox = EnumFirebox.values()[stack.getItemDamage()];
        return CivilisedIllumination.modNamespace + firebox.getName().toLowerCase();
    }
}
