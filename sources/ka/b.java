package ka;

/* JADX INFO: loaded from: classes12.dex */
public interface b {

    public interface a {
        ka.a getAllocation();

        a next();
    }

    void a(ka.a aVar);

    ka.a allocate();

    void b(a aVar);

    int getIndividualAllocationLength();

    void trim();
}
