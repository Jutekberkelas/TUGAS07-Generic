
public class Mahasiswa<Nim, Name, Clas> {
    private Nim nim;
    private Name name;
    private Clas clas;

    void setNim(Nim nim) {
        this.nim = nim;
    }
    
    public Nim getNim(){
        return nim;
    }

    void setName(Name name) {
       this.name = name;
    }
    
    public Name getName(){
        return name;
    }

    void setClas(int i) {
        this.clas = clas;
    }
    
    public Clas getClas(){
        return clas;
    }
    
}
