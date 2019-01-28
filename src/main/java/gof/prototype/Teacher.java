package gof.prototype;

public class Teacher{
    
    // public Paper[] createManyCrystals(){
    //     Paper[] papers= new Paper[100];
    //     for(int n=0; n<papers.length; n++){
    //         drawCystal(papers[n]);
    //         cutAccordanceWidhLine(papers[n]);
    //     }
    //     return papers;
    // }

    public Paper[] createManyCrystals(){
    Paper paper= new Paper("星");
    drawCystal(paper);
    cutAccordanceWidhLine(paper);

    Paper[] papers = new Paper[100];

    for(int n=0; n < papers.length; n++){
        papers[n] = (Paper)paper.createClone();
    }

    return papers;
}

    private void drawCystal(Paper paper){
        //星型に線を描く（時間がかかる）
    }

    private void cutAccordanceWidhLine(Paper paper){
        //星型に線を描く（時間がかかる）
    }

}