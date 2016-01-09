package mods.eln.item;

import java.util.Collections;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import static mods.eln.i18n.I18N.tr;

public class OverVoltageProtectionDescriptor extends GenericItemUsingDamageDescriptorUpgrade {

	public OverVoltageProtectionDescriptor(String name) {
		super(name);
	}

    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4) {
    	super.addInformation(itemStack, entityPlayer, list, par4);
		Collections.addAll(list, tr("Useful to prevent over-voltage\nof Batteries").split("\\\n"));
	}
}
