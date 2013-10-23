// Date: 8/6/2013 1:16:49 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


//LONG LIVE SHARK WEEK!



package fisherman77.paleocraft.common.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.MathHelper;

public class ModelMegalodon extends ModelBase
{
  //fields
    ModelRenderer RightPelvic;
    ModelRenderer LeftPelvic;
    ModelRenderer LeftPectoral;
    ModelRenderer RightPectoral;
    ModelRenderer TailFin;
    ModelRenderer Tail2;
    ModelRenderer Tail1;
    ModelRenderer Jaw;
    ModelRenderer Head;
    ModelRenderer Body1;
    ModelRenderer Nose;
    ModelRenderer BackFins;
    ModelRenderer Dorsal;
    ModelRenderer NoseTip;
    private float partialTicks;
	private EntityDragon par1Entity;
	private float f3;
  public ModelMegalodon()
  {
    textureWidth = 200;
    textureHeight = 200;
    
      RightPelvic = new ModelRenderer(this, 45, 136);
      RightPelvic.addBox(-6F, 0F, -3F, 7, 1, 7);
      RightPelvic.setRotationPoint(-4F, 21F, 24F);
      RightPelvic.setTextureSize(200, 200);
      RightPelvic.mirror = true;
      setRotation(RightPelvic, 0F, 0F, -0.837758F);
      LeftPelvic = new ModelRenderer(this, 120, 138);
      LeftPelvic.addBox(-1F, 0F, -3F, 7, 1, 7);
      LeftPelvic.setRotationPoint(4F, 21F, 24F);
      LeftPelvic.setTextureSize(200, 200);
      LeftPelvic.mirror = true;
      setRotation(LeftPelvic, 0F, 0F, 0.837758F);
      LeftPectoral = new ModelRenderer(this, 115, 168);
      LeftPectoral.addBox(0F, 0F, -4F, 12, 1, 10);
      LeftPectoral.setRotationPoint(5F, 22F, 6F);
      LeftPectoral.setTextureSize(200, 200);
      LeftPectoral.mirror = true;
      setRotation(LeftPectoral, 0F, 0F, 0.4363323F);
      RightPectoral = new ModelRenderer(this, 21, 101);
      RightPectoral.addBox(-12F, 0F, -4F, 12, 1, 10);
      RightPectoral.setRotationPoint(-5F, 22F, 6F);
      RightPectoral.setTextureSize(200, 200);
      RightPectoral.mirror = true;
      setRotation(RightPectoral, 0F, 0F, -0.4363323F);
      TailFin = new ModelRenderer(this, 80, 72);
      TailFin.addBox(0F, -16F, 13F, 0, 30, 24);
      TailFin.setRotationPoint(0F, 14F, 35F);
      TailFin.setTextureSize(200, 200);
      TailFin.mirror = true;
      setRotation(TailFin, 0F, 0F, 0F);
      Tail2 = new ModelRenderer(this, 135, 5);
      Tail2.addBox(-2.5F, -2F, 0F, 5, 8, 18);
      Tail2.setRotationPoint(0F, 14F, 35F);
      Tail2.setTextureSize(200, 200);
      Tail2.mirror = true;
      setRotation(Tail2, 0F, 0F, 0F);
      Tail1 = new ModelRenderer(this, 81, 32);
      Tail1.addBox(0F, 0F, 0F, 8, 11, 13);
      Tail1.setRotationPoint(-4F, 11F, 22F);
      Tail1.setTextureSize(200, 200);
      Tail1.mirror = true;
      setRotation(Tail1, 0F, 0F, 0F);
      Jaw = new ModelRenderer(this, 37, 74);
      Jaw.addBox(-4.5F, -1F, -11F, 9, 3, 11);
      Jaw.setRotationPoint(0F, 20F, -3F);
      Jaw.setTextureSize(200, 200);
      Jaw.mirror = true;
      setRotation(Jaw, 0.3316126F, 0F, 0F);
      Head = new ModelRenderer(this, 84, 2);
      Head.addBox(-3.5F, -3F, -7F, 12, 9, 7);
      Head.setRotationPoint(-2.5F, 14F, -5F);
      Head.setTextureSize(200, 200);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Body1 = new ModelRenderer(this, 6, 152);
      Body1.addBox(0F, 0F, 0F, 11, 13, 27);
      Body1.setRotationPoint(-5.5F, 11F, -5F);
      Body1.setTextureSize(200, 200);
      Body1.mirror = true;
      setRotation(Body1, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 55, 0);
      Nose.addBox(-3.5F, -3F, -10F, 10, 8, 3);
      Nose.setRotationPoint(-1.5F, 14.5F, -5F);
      Nose.setTextureSize(200, 200);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      BackFins = new ModelRenderer(this, 30, 0);
      BackFins.addBox(0F, -7F, 0F, 0, 18, 10);
      BackFins.setRotationPoint(0F, 14F, 35F);
      BackFins.setTextureSize(200, 200);
      BackFins.mirror = true;
      setRotation(BackFins, 0F, 0F, 0F);
      Dorsal = new ModelRenderer(this, 16, 32);
      Dorsal.addBox(0F, 0F, 0F, 0, 10, 17);
      Dorsal.setRotationPoint(0F, 1F, 0F);
      Dorsal.setTextureSize(200, 200);
      Dorsal.mirror = true;
      setRotation(Dorsal, 0F, 0F, 0F);
      NoseTip = new ModelRenderer(this, 87, 59);
      NoseTip.addBox(-3.5F, -3F, -10F, 8, 7, 3);
      NoseTip.setRotationPoint(-0.5F, 14.5F, -8F);
      NoseTip.setTextureSize(200, 200);
      NoseTip.mirror = true;
      setRotation(NoseTip, 0F, 0F, 0.0174533F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    RightPelvic.render(f5);
    LeftPelvic.render(f5);
    LeftPectoral.render(f5);
    RightPectoral.render(f5);
    TailFin.render(f5);
    Tail2.render(f5);
    Tail1.render(f5);
    Jaw.render(f5);
    Head.render(f5);
    Body1.render(f5);
    Nose.render(f5);
    BackFins.render(f5);
    Dorsal.render(f5);
    NoseTip.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  
 
  
  
  public void setLivingAnimations(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4)
  {
     // this.partialTicks = par4;
      //this.Jaw.rotateAngleX = (float)(Math.sin((double)(f3 * (float)Math.PI * 2.0F)) + 1.0D) * 0.2F;
      
  }

private float func_78172_a(float f, float g) {
	// TODO Auto-generated method stub
	return 0;
}

public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {

	//this.Jaw.rotateAngleX = (float)(Math.sin((double)(f3 * (float)Math.PI * 0.4F)) + 1.0D) * 0.2F;

	 this.Jaw.rotateAngleX = MathHelper.cos(f * 0.6662F) * 0.5F * f1;
	 this.TailFin.rotateAngleY = MathHelper.cos(f * 0.6662F) * 0.5F * f1;
	 //this.Tail1.rotateAngleY = MathHelper.cos(f * 0.6662F) * 0.5F * f1;
	 this.Tail2.rotateAngleY = MathHelper.cos(f * 0.6662F) * 0.5F * f1;
	 this.BackFins.rotateAngleY = MathHelper.cos(f * 0.6662F) * 0.5F * f1;

  }

}