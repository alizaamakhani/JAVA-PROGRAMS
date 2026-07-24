class Comparable1 implements Comparable<Comparable1>{
    int age;
    Comparable1(int age){
        this.age=age;
    }
        public int compareTo(Comparable1 c){
            return this.age - c.age;
        }


    }
