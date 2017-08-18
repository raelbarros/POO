package poo_2;

public class Circuferencia {
    
        private float raio;
        //private final float Pi = 3.14f;
        
        public Circuferencia(){
            System.out.println("Objeto criado");
        }
        
        public Circuferencia(float r){
            this.raio = r;
        }
        
        public  float getRaio(){
            return this.raio;
        }
        
        public void setRaio(float r){
            this.raio = r;
        }
        
        public float getDiametro(){
            return 2 * this.raio;
        }
        
        public float getArea(){
            //return (float)(Math.PI*(this.raio*this.raio));
            return (float)(Math.PI*(Math.pow(this.raio, 2)));
        }
              
    
}
