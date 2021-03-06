package ActionPackage;

import localpackage.*;

import java.util.ArrayList;
import java.util.List;

public class Action {
    private int TeaID;
    private int StuID;
    private BSTeacher bsTeacher=new BSTeacher();
    private Dao dao =new Dao();
    private Student student =new Student();
    private Student studemo=new Student();
    private Teacher teacher =new Teacher();
    private Teacher teademo=new Teacher();
    private TeaREIN teaREIN=new TeaREIN();
    private TeaREIN tridemo=new TeaREIN();
    private StuREIN stuREIN=new StuREIN();
    private StuREIN sridemo=new StuREIN();
    private List<TeaREIN> listoftri=new ArrayList<TeaREIN>();

    public static void main(String[] args) {
        Action action=new Action();
        action.StuID=1031;
        String str=action.MatchForStu();
        for(int i=0;i<action.listoftri.size();i++){
            System.out.println(action.listoftri.get(i).getID()+" "+
                    action.listoftri.get(i).getSex()+" "+
                    action.listoftri.get(i).getEducation());
        }
    }
    public String SingleTea(){
        bsTeacher=dao.SingleTea(TeaID);
        System.out.println(TeaID);
        System.out.println(bsTeacher.getTeacher().getNickName());
        return "SINGLETEA";

    }
    public String MatchForStu(){
        listoftri=dao.MatchForStu(StuID);
        if(listoftri!=null){
            return "STUSUCCESSMATCH";
        }else{
            return "STUFAILEDMATCH";
        }


    }
    public String StuREINUpdate(){
        sridemo=dao.StuReInUpdate(stuREIN);
        if(sridemo!=null){
            return "STUSUCCESSREIN";
        }else{
            return "STUFAILEDREIN";
        }

    }
    public String TeaREINUpdate(){
        tridemo=dao.TeaReInUpdate(teaREIN);
        if(tridemo!=null){
            System.out.println(tridemo.getSex());
            return "TEASUCCESSREIN";

        }else{
            return "TEAFAILEDREIN";
        }

    }
    public String TeaLog(){
        teademo=dao.TeaLog(teacher);
        if(teademo!=null){
            return "TEASUCCESSLOG";
        }else{
            return "TEAFAILEDLOG";
        }
    }
    public String TeaInsert(){
        teademo=dao.TeaInsert(teacher);
        if(teademo!=null){
            return "TEASUCCESSREGIST";
        }else{
            return "TEAFAILEDREGIST";
        }
    }
    public String StuInsert(){
        studemo=dao.StuInsert(student);
        if(studemo!=null){
            return "STUSUCCESSREGIST";
        }else{
            return "STUFAILEDREGIST";
        }
    }
    public String StuLog(){
        studemo=dao.StuLog(student);
        if(studemo!=null){
            return "STUSUCCESSLOG";
        }else{
            return "STUFAILEDLOG";
        }
    }

    public BSTeacher getBsTeacher() {
        return bsTeacher;
    }

    public void setBsTeacher(BSTeacher bsTeacher) {
        this.bsTeacher = bsTeacher;
    }

    public int getTeaID() {
        return TeaID;
    }

    public void setTeaID(int teaID) {
        TeaID = teaID;
    }

    public List<TeaREIN> getListoftri() {
        return listoftri;
    }

    public void setListoftri(List<TeaREIN> listoftri) {
        this.listoftri = listoftri;
    }

    public int getStuID() {
        return StuID;
    }

    public void setStuID(int stuID) {
        StuID = stuID;
    }

    public StuREIN getSridemo() {
        return sridemo;
    }

    public void setSridemo(StuREIN sridemo) {
        this.sridemo = sridemo;
    }

    public StuREIN getStuREIN() {
        return stuREIN;
    }

    public void setStuREIN(StuREIN stuREIN) {
        this.stuREIN = stuREIN;
    }

    public TeaREIN getTridemo() {
        return tridemo;
    }

    public void setTridemo(TeaREIN tridemo) {
        this.tridemo = tridemo;
    }

    public TeaREIN getTeaREIN() {
        return teaREIN;
    }

    public void setTeaREIN(TeaREIN teaREIN) {
        this.teaREIN = teaREIN;
    }

    public Teacher getTeademo() {
        return teademo;
    }

    public void setTeademo(Teacher teademo) {
        this.teademo = teademo;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudemo() {
        return studemo;
    }

    public void setStudemo(Student studemo) {
        this.studemo = studemo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
