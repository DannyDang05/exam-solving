public class video{
    private String title;
    private String classification;
    private int time;
    public video(String fulltitle, String programclassification,int runningtime){
        title = fulltitle;
        classification=programclassification;
        time = runningtime;

    }
    public void settitle(String fulltitle){
        title = fulltitle;
    }
    public String gettitle(){
        return title;
    }
    public void setclassification(String programclassification){
        classification=programclassification;
    }
    public String getclassification(){
        return classification;
    }

    public String formattime(){
        if(time>60){
            String realtime = time/60+" giờ "+time%60+" phút";
            return realtime;
        }
        return time+" phút";
    }

    public void print(){
        System.out.println("Tiêu đề video: "+title);
        System.out.println("Phân loại: "+classification);
        System.out.println("Thời lượng: "+time);
    }

    public static void main(String[] args) {
        video a = new video("hi", "children", 50);
        System.out.println(a.formattime());
        a.print();
    }

}
