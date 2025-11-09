package jake1702.civilisedillumination.blocks;

import jake1702.civilisedillumination.CivilisedIllumination;
import jake1702.civilisedillumination.misc.EnumFirebox;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class BlockFirebox extends Block {
    protected IIcon[] icons;

    public BlockFirebox() {
        super(Material.rock);

        //this.setBlockTextureName(CivilisedIllumination.modNamespace + ModStrings.stringFirebox);
        //this.setBlockName(ModStrings.stringFirebox);
        //this.setCreativeTab(CivilisedIllumination.creativeTab);
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (EnumFirebox firebox : EnumFirebox.values()) {
            list.add(new ItemStack(item, 1, firebox.getMeta()));
        }
    }

    public void registerBlockIcons(IIconRegister reg) {
        icons = new IIcon[EnumFirebox.count()];
        String prefix = CivilisedIllumination.modNamespace;

        for (EnumFirebox firebox : EnumFirebox.values()) {
            icons[firebox.getMeta()] = reg.registerIcon(prefix + firebox.getName());
        }
    }

    public IIcon getIcon(int side, int meta) {
        if (meta >= 0 && meta < EnumFirebox.count()) {
            return icons[meta];
        }
        return null;
    }
}
