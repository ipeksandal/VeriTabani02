// interface : arayüz
public class Main {
    public interface Sellable {
        public  String description();
        public int listPrice();
        public int lowesPrice();  //yöntem - int döndürüyor.

    public class photograf implements Sellable {

        private String descript;
        private int price;
        private boolean color;

        public photograf(String desc, int p, boolean c){
            descript = desc;
            price = p;
            color = c;
        }

        public String description(){
            return descript;
        }

        @Override
        public int listPrice() {
            return price;
        }

        @Override
        public int lowesPrice() {
            return price/2;
        }
        public boolean isColor(){
            return color;
        }

    }

    public  interface Transfortable{
        public int weight();
        public boolean isHazardous();
    }
    public class BoxedItem implements Sellable, Transfortable{

        private String descript;
        private int price;
        private int weight;
        private boolean haz;
        private int height = 0;
        private int width = 0;
        private int depth = 0;    //üç boyutlu kutu.

        public BoxedItem(String desc, int p, int w, boolean h){
            descript = desc;
            price = p;
            weight = w;
            haz = h;

        }

        @Override
        public int weight() {
            return weight;
        }

        @Override
        public boolean isHazardous() {
            return haz;
        }

        @Override
        public String description() {
            return descript;
        }

        @Override
        public int listPrice() {
            return price;
        }

        @Override
        public int lowesPrice() {
            return price/2;
        }

        public int insuredValue(){
            return price*2;
        }
        public void setBox(int h, int w, int d){
            height = h;
            weight = w;
            depth = d;
        }

    public abstract class Progression{
        // soyut sınıf
        protected long current;
        public Progression(){
            this(0);
        }
        public Progression(long start){
            current = start;
        }
        public long nextValue(int n){
            long answer = current;
            advance();
            return answer;
            }
        public void printProgression(int n){
            System.out.println(nextValue(n));
            for (int j = 1 ; j<n ; j++){
                System.out.println(" " + nextValue(n));
            System.out.println();
            }
        }
        protected abstract void advance();
    }
    //Aprog = new ArithmeticProgression(); - nesne oluşturduk.
        // abstract classlarda nesne tanımlamıyoruz.

    }


        
    }
}
