package com.runic.gopti.proxies;

import com.runic.gopti.data.ModStrings;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * This file was born into existence by our overlord RunicEnergy on 14Mar2017 at 18:23.
 */
public class ClientProxy extends CommonProxy{
    @Override
    public void registerItemRenderer(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ModStrings.MODID + ":" + id, "inventory"));
    }
}
