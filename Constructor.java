class Constructor{

    Constructor(){
        System.out.println("Within Constructor");
    }

    Public Static void main(String[] args){
        System.out.println("within main method");
        Constructor c=new Constructor();
    }

}