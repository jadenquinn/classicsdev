
package to.us.iredmc.classics.item;

import to.us.iredmc.classics.itemgroup.ClassicsctabItemGroup;
import to.us.iredmc.classics.ModClassicsModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@ModClassicsModElements.ModElement.Tag
public class PtbackinarmsdiscItem extends ModClassicsModElements.ModElement {
	@ObjectHolder("mod_classics:ptbackinarmsdisc")
	public static final Item block = null;
	public PtbackinarmsdiscItem(ModClassicsModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ModClassicsModElements.sounds.get(new ResourceLocation("mod_classics:pcbackinarmsaudio")),
					new Item.Properties().group(ClassicsctabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ptbackinarmsdisc");
		}
	}
}
