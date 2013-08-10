package bladeking68.paleocraft.dimension;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenPaleoplains extends BiomeGenBase
{
      
       private WorldGenMinable theWorldGenerator;
       private WorldGenerator WorldGenPaleocraft1;
       private WorldGenTrees WorldGenPaleocraftTree1;
       public BiomeGenPaleoplains(int par1)
       {
             super(par1);
             this.theBiomeDecorator.treesPerChunk = 10;
           //  this.theBiomeDecorator.flowersPerChunk = -999;
            // this.theBiomeDecorator.deadBushPerChunk = -999;
            // this.theBiomeDecorator.grassPerChunk = -999;
             //this.theWorldGenerator = new WorldGenMinable(Block.pumpkin.blockID, -999);
             this.spawnableMonsterList.clear();
             this.spawnableCreatureList.clear();
             this.spawnableWaterCreatureList.clear();
             
             //   this.spawnableMonsterList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityDromaeosaurus.class, 1, 4, 4)); //Fisherman just keep coping this for each dino and the numbers are the spawn rate i think so you can edit that if you want
             //this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityDromaeosaurus.class, 3, 4, 4));
             this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityCitipati.class,  3, 1, 1));
             this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityDimorphodon.class,  4, 4, 4));}
             //this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityBaryonyx.class,  1, 1, 1));
             //this.spawnableCreatureList.add(new SpawnListEntry(fisherman77.paleocraft.common.mobs.EntityTroodon.class,  2, 1, 1));}{
             //this.WorldGenPaleocraft1 = new WorldGenPaleocraftTree1(false);}
       
       public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
   	{
   	return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ? this.WorldGenPaleocraftTree1 : this.worldGeneratorTrees));}


}
