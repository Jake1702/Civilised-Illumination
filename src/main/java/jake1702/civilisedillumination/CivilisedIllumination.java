package jake1702.civilisedillumination;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import jake1702.civilisedillumination.blocks.ModBlocks;
import jake1702.civilisedillumination.proxy.Common;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(
    modid = CivilisedIllumination.modID,
    name = CivilisedIllumination.modName,
    version = CivilisedIllumination.modVer)
public class CivilisedIllumination {
    public static final String modID = "civilisedillumination";
    public static final String modName = "Civilised Illumination";
    public static final String modVer = "0.1";
    public static final String modNamespace = modID.toLowerCase() + ":";

    @Instance(modID)
    public static CivilisedIllumination instance;

    @SidedProxy(clientSide = "jake1702.civilisedillumination.proxy.Client", serverSide = "jake1702.civilisedillumination.proxy.Common")
    public static Common proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.registerBlocks();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    public static CreativeTabs creativeTab = new CreativeTabs("tabCivilisedIllumination") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.glowstone);
        }
    };
}
