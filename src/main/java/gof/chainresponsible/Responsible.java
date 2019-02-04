package gof.chainresponsible;

public abstract class Responsible{
    private Responsible next = null;
    private String responsiblePerson = null;

    public Responsible(String responsiblePerson){
        this.responsiblePerson = responsiblePerson;
    }

    public Responsible setNext(Responsible next){
        this.next = next;
        return next;
    }

    public final void putQuestion(gof.chainresponsible.Question question){
        if(beAbleToJudge(question)){
            judge(question);
        }else if(next != null){
            next.putQuestion(question);
        }else{
            System.out.println("誰にも判断できませんでした。やってみなさい");
        }
    }

    protected abstract boolean beAbleToJudge(Question question);
    public abstract void judge(Question question);
}