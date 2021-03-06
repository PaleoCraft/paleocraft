package fisherman77.paleocraft.common.mobs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import fisherman77.paleocraft.common.Paleocraft;

@SideOnly(Side.CLIENT)
public class RenderCryo extends RenderLiving
{
    /** Scale of the model to use */
    private float scale;
    
    private static final ResourceLocation skin = new ResourceLocation("paleocraft", "textures/entity/Cryolophosaurus.png");
	
	/*public RenderBaryonyx(ModelBaryonyx model, float shadowSize, float par3, float par2) {
		super(model, shadowSize);
		this.scale = par3;
	}*/
    /**
     * Applies the scale to the transform matrix
     */
    protected void preRenderScale(EntityCryo par1EntityCryo, float par2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }
    public RenderCryo(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
    }
	
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.preRenderScale((EntityCryo)par1EntityLivingBase, par2);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return skin;
	}
}
