class LC2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean flag1=false;
        boolean flag2=false;
        int di=(int)Math.pow(10,4);
        if(length>=di || width>=di || height>=di ||(long)length*width*height>=Math.pow(10,9)) flag1=true;
        if(mass>=100) flag2=true;
        
        if(flag1 && flag2) return "Both";
        else if(flag1) return "Bulky";
        else if(flag2) return "Heavy";
        return "Neither";
    }
}
