package com.xiutek.xmod.item;

import com.xiutek.xmod.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    public static final RegistryObject<Item> COPPER_INGOT =
            Registration.ITEMS.register("apex_ingot",
    () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register () { }

}
