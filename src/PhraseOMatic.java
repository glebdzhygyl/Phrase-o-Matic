public class PhraseOMatic {

    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "multi-Tier" , "30.000 foot","B-to-B","win-win","front-end", "web-based",
                "pervasive", "smart", "six-sigma","critical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky","value-added", "oriented", "centric", "distributed","clustered",
        "branded","outside-the-box", "positioned"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
        "strategy", "mindshare"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        /*System.out.println(oneLength);
        System.out.println(twoLength);
        System.out.println(threeLength);*/
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        /*System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);*/
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println(phrase);
    }
}
