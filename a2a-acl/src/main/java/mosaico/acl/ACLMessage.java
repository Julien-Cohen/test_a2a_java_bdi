package mosaico.acl;

public class ACLMessage {
    public String illocution ;
    public String content ;
    public String sender ;
    public String codec ;
    public ACLMessage(String illocution, String content, String sender, String codec){
        this.illocution = illocution ;
        this.content = content ;
        this.sender = sender ;
        this.codec = codec ;
    }
}
