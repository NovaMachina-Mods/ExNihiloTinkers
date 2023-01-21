package novamachina.exnihilotinkers.datagen.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import novamachina.exnihilosequentia.common.utility.ExNihiloConstants;
import novamachina.exnihilosequentia.datagen.api.datagen.AbstractOreItemGenerator;
import novamachina.exnihilotinkers.common.init.EXNTinkersItems;

public class EXNTinkersOreItems extends AbstractOreItemGenerator {

  public EXNTinkersOreItems(DataGenerator generator, ExistingFileHelper existingFileHelper) {
    super(generator, ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, existingFileHelper);
  }

  @Override
  protected void registerModels() {
//    registerPiece(EXNTinkersItems.COBALT);
  }
}
