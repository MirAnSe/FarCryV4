public class Model {

    private Viewer viewer;
    int x1,y1,width1,height1,x2,y2,width2,height2,step,ind;


    Model(Viewer viewer){
        this.viewer = viewer;

        step=10;

        ind=0;

        x1=50;
        y1=50;
        width1=100;
        height1=100;

        x2 = 350;
        y2 = 250;
        width2 = 200;
        height2 = 200;


    }

    public void move(String direction){
        if (direction.equals("Up") && y1>50){
            moveUp();
        }else if(direction.equals("Right") && x1<650){
            moveRight();
        }else if(direction.equals("Down") && y1<650){
            moveDown();
        }else if(direction.equals("Left") && x1>50){
            moveLeft();
        }
        findQ();
        viewer.update();
    }

    private void moveUp(){
        y1=y1-step;
    }

    private void moveRight(){
        x1=x1+step;
    }

    private void moveDown(){
        y1=y1+step;
    }

    private void moveLeft(){
        x1=x1-step;
    }
    private void findQ(){
        if ((x1+width1)>=x2 && x1<=(x2+width2) && (y1+height1)>=y2 && y1<= (y2+height2)){
            ind++;
            System.out.println("ok-"+ind);
        }
        //int result1=x2+width2;
        //System.out.println("x1 - "+x1+". y1 - "+y1);
    }
}
