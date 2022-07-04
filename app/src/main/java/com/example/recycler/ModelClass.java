package com.example.recycler;


//holding the information of every item in recycler view

public class ModelClass {

    //1.declaring items in the model layout
    private int imageView1;
    private String textView;
    private String textView2;
    private String textView3;
    private String divider;



    //3.create constructor
    public ModelClass(int imageView1, String textView, String textView2, String textView3, String textView4) {
        this.imageView1 = imageView1;
        this.textView = textView;
        this.textView2 = textView2;
        this.textView3 = textView3;
        this.divider = divider;
    }

    

    //2.create getters and setters
    public int getImageView1() {
        return imageView1;
    }

    public void setImageView1(int imageView1) {
        this.imageView1 = imageView1;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public String getTextView2() {
        return textView2;
    }

    public void setTextView2(String textView2) {
        this.textView2 = textView2;
    }

    public String getTextView3() {
        return textView3;
    }

    public void setTextView3(String textView3) {
        this.textView3 = textView3;
    }

    public String getTextView4() {
        return divider;
    }

    public void setTextView4(String textView4) {
        this.divider = textView4;
    }
}
