import java.util.HashSet;

public class Freq {
    public HashSet<Sequence> FrSeq = new HashSet<Sequence>();

    Freq() {
        FrSeq = new HashSet<Sequence>();
    }

    public void AddFreqsOutput(Freq fs) {
        FrSeq.addAll(fs.FrSeq);
    }

    Freq(HashSet<Sequence> sequence) {
        FrSeq.addAll(sequence);
    }

    public void AddListsToSequence(Sequence tran) {
        FrSeq.add(tran);
    }
}
