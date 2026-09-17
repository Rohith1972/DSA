import java.util.Scanner;
class TrieNode{
    boolean isLeaf;
    int count;
    TrieNode[] child;
    TrieNode(){
        child = new TrieNode[26];
        isLeaf = false;
        count = 0;
    }
}
class Trie{
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    void insert(String s){
        TrieNode curr = root;
        for(char ch: s.toCharArray()){
            if(curr.child[ch-'a']==null){
                curr.child[ch-'a'] = new TrieNode();
            }
        }
        curr.isLeaf = true;
        curr.count = 1;
    }
    boolean search(String s){
        TrieNode curr = root;
        for(char ch : s.toCharArray()){
            if(curr.child[ch-'a']==null){
                return false;
            }
        }
        return curr.isLeaf;
    }
    boolean prefixSearch(String s){
        TrieNode curr = root;
        for(char ch : s.toCharArray()){
            if(curr.child[ch-'a']==null){
                return false;
            }
        }
        return true;
    }
    int countString(String s){
        TrieNode curr = root;
        for(char ch : s.toCharArray()) {
            if (curr.child[ch - 'a'] == null) {
                return 0;
            }else{
                return curr.count - curr.child[ch-'a'].count;
            }
        }
        return 0;
    }
    int countPrefixString(String s){
        TrieNode curr = root;
        for(char ch : s.toCharArray()){
            if(curr.child[ch-'a']==null){
                return 0;
            }
        }
        return curr.count;
    }
}
class TrieMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Trie trie = new Trie();
        while(true){
            System.out.println("1.Insert\n2.Search\n3.PrefixSearch\n4.CountString\n5.CountPrefixString\n6.Exit\n");
            int ch = sc.nextInt();
            switch(ch){
                case 1 :    String a = sc.next();
                            trie.insert(a);
                            break;
                case 2 :    String b = sc.next();
                            System.out.println(trie.search(b));
                            break;
                case 3 :    String c = sc.next();
                            System.out.println(trie.prefixSearch(c));
                            break;
                case 4 :    String d = sc.next();
                            System.out.println(trie.countString(d));
                            break;
                case 5 :    String e = sc.next();
                            System.out.println(trie.countPrefixString(e));
                            break;
                case 6 : System.exit(0);
            }
        }
    }
}