package at.fhtw.lpa;

public class Note {
    private String fach;
    private int note;

    public Note() {
    }

    public Note(String fach, int note) {
        this.fach = fach;
        this.note = note;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) throws IllegalArgumentException {
        if(note >= 1 && note <= 5){
            this.note = note;
        } else {
            throw new IllegalArgumentException("Note muss zwischen 1 und 5 liegen");
        }

    }

    @Override
    public String toString() {
        return "Note{" +
                "fach='" + fach + '\'' +
                ", note=" + note +
                '}';
    }
}
