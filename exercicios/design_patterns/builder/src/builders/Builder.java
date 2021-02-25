package builders;

public interface Builder {
    void buildTelhado();
    void buildPortas();
    void buildChao();
    void buildJardim();
    void buildPiscina();
    void buildJanelas();
    String getBuilder();
    void reset();
}
