package rebelkeithy.mods.metallurgy.machines.pylon;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockPylonItem extends ItemBlock
{
    public BlockPylonItem(int i)
    {
        super(i);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int i)
    {
        return i;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        String name = BlockPylon.names[itemstack.getItemDamage()] ;
        
        name = name.replaceAll("//s", "");

        return getUnlocalizedName() + "." + name;
    }
}
