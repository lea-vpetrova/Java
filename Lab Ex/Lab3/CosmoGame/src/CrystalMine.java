public class CrystalMine extends BaseBuilding{
        private static final int metalRequired = 0;
        private static final int crystalRequired = 0;
        private static final int gasRequired = 0;
        private static final int uraniumRequired = 0;

        //We do not need any resources to build Crystal Mine.
        public CrystalMine(String name, int level, int constructionTime) {
            super(name, level, constructionTime, metalRequired, crystalRequired, gasRequired, uraniumRequired);
        }

        @Override
        public void upgrade() {
            int currentLevel = getLevel();
            currentLevel++;
            setLevel(currentLevel);
        }

}
