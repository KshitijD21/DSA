import java.util.HashMap;
import java.util.Map;

public class MinimumLengthOfTheStringAfterOperation {

    public static void main(String[] args) {
        String s = "jbqxcgbkaywugxiafuaggxctzookuomlsvsvmhhzhpklpkevynoluecapibrwlzjoqrelgpbnrpszesunkaicsadmcaocubofajmkemewlwpiyztubvcjdzbrzxwgkvbwclabzvlxnzlpeccaudagtajdzprikpinlwswnqqilbpeuyvmnglzhmvyftoqgtuirsssdxhpzjqbgiicpiigixnigcmrzatbjulqtuvtczwnisgewofajhfjxrusbjsnmstskkhervjxhppmijvpvdgzcanvljhhgnmfzribjyoaqudylcvchqhrvfuzouipiorexbwtdfvbuvvwzyljtoaohvaoekfmazprjczfwjmekkbnchehspgropwtyugvbwgyyzlosxxihjssdmpwvdlmmmvorhxmqehqnuoilnstdjnwreopxugznrmwribyfkefvmffpiorgnzzomsohpoepcmyxuazivrxvfebjabpeyniybfbolarchcmibvgbstpkcgwkfyxqzhgbyzlcgooloayamfhjaezfijeowtdgmmgmplobdzeajamqhmjfxhudekzvboqhelkczqrnbkpeivghhkqglfhojtirvipkierisxydefhoyvapiwnqjzmkbcescfvcommtsxbqvdlrpmqtwjrekbtrviripltjmwrwziwythiwhwqxagtppwiixvgkvsueuxfuqlmnkbmzpjyhufbwnqcksaewkeudsqqfpwuxweltoutzrytzqssqgyepfgflcruqarganvmdyfmenpmjxberlfmmxkqjelnfscuctzmxctygilkhpwetdigrcudgbfpwohahdmeihvfeonfxbbqllhwbqazjtxmpstpvjwewhgmhmvpjrtsodzyntrxqvqlrtejktuldvjzjzoiaezlbvnuokjxcenfmvpksxlslxxwbkijjzyxjxfpawntydelgfyhoyeqxcqgewvvhwpyufdpcudpulfplsfqjfsavptocnhejxoadxscaunnnrwlxdxemnvtzwrgiywizzorbjtfrgvozepjuiculxkftmttbxluguctededhjjefnwbrpvvhnwtciuhybkrkqzhxgbqwvgsgfppswztoyrspddretkqysksizqowqzyptdgkbxpmqfexwahxvhsitznoqhsxjsjnqsvqfsahexylwyezxozwmmmrjcrhwgwbezfryomiirnpvevobhgwwrwddoiixhezdqkjwbfelfcpingbxibbmgbfejsmdilqcjdsbpwrhujylvelwgpbbbiflnjgfhxpyuilijryuomwnbkcxbuosyymxmlxlfuqgglenwlyctqyctoorprszpuwuahxgdoxtejyfzqttdlbefgalzttbnnpyxjauihvwstonoiztwfviulzvrqqsvatbjeytvulvyhoauiailehneurwjvthjjqdwtjucasxiappklutfqjfnjtmjbnmuhqqligvftjqokpwbwqjnrgkrmzcbfirchtrelsilsflzkzkelxfhclxbayxvxumvaqrrqmlufstjfvpflpxrdaunpwlmotfcbptiohojxntxjtvomfebvyqmkngstudrixrqocztsawyecgbevenulvthgvfbizunoctxglfgyturdyjlvewhqtfkteqafymitnfhxgonmyacmosfezrwiyopvdopkupprrawoknctoydhgqjvooemybtyvwecatuslisfzfsmkfecneldouwsleovdwyeqnnwrdejntacruvqrgylohznxbxnybtmlqrqlekpjzoujgtgquszyrlqyhoovpnedwjpgfidfhduqgixyhxholwqyxxobsnegoiniujivwzwsloafthgdcomyxnagminxaokbiyzhlsmlctqmdbdquhhkxhsaejsgvjospkojmfndjxubbspgnzonzoecevjkxsjsshfyjfmakjgseowjhblracgylrmwcrixpqnduxreuypqipkxcucfjluvqqafntpwnrvxkqmwkrkbuuerctuwchktdzazoumihbxxpailpyolyvvthxnwtodldlsowbtaptllevgceqghqivceitedvdqaegobtrngjjadzuwjrtbnfkufzwvjelysbardpiidfgoloqziakswvgneibjkdstyuaeaelfwlzpyjtxeeliomjbksjzzpkaouzzoqyjqtoddadnnvvfvafiguoiekpxzabxiydywbrygflonwpryxqokwnypevdkunzcmkfcrawxmlxihfukapbkeosykhoyxhejnjbcnmyktaclhqgeifdkiydrzzostgbwjaasymqvzpumwltdtglqlwwfmgqccxugdrlipjybbyykbgpgnmhpgrcgnydunqqlfepuywdhbkuhgiponvvrzlatpkbstyskxgxwewfcepdqdwxqvlqcuuxvdcshwfvktgdnioanvjazyudbqomiutwkjjuisedlqbenojoefjbuxyfcygnwycilqbalzleyqmhbbkfssatggywzbbghxdhbpfjiugtzwnozmspiyalewsnffptmaocdkjbstwisxjdvomkcxijqidfmksrlwwoejpnvxeechpiiqwwdfxlfcqtvdsoepdxfmeitysnszkiepcabsjmbkggqafrgucitcxcrurizicvaorzbaihuusqyxlfjfaccycxarsbejvncyqhvlkiuunrbsanzrxndjrnjmukpinjmivfirefiuihfpzdlficbecjlozcndyucjqlmkcfwzkuudtribghdylyxmvgeqajtvgfjyahpoyvvwtwvrubvwsquwffdoyajaqhirlidspsvwitjgyabgriugcsabzhnkdggvioxbvjmrzfsofdetncdsekhqbyewavflglosjemqigxkhzkadhvnwrvkhwxxrdwmxjaitshxihoecdkbzddiuirndctytmowlcijmqlfarbwqjsnpzjhkluoagdywytherttsbxhuiafrwawuyridkfrxzkfnyqfipwkdrzwsvpbyweljvgaveihxuyddhqyychemonhxlyykkxqtssfzhedcxbkzbgldwqzrjelukkgopcnxtucteezknofkyuatqqjaovvfxilnzcxzlijojzjfhmslwjlzllighaezeqmsegrhbjtsnwaloxgvirtbvxyexufusihrvkcxaondtknnnrrodtoqmszldlaixlpawpacjynmfobqspsaewqqanevtpjpvruuddwxuxatvdhrjflfnutanzqcuiuxqkefbcfgxpcvemxannzfjtnpovnjpymalgwqifgosyqmsrtxryhamdpclkfyxpsxyabwchwnkgzbkbymvhcykadbhmmrelydoksiprqxljqdriaahnpxfgvixgkwqehvauqhxugvscdznqirblheyemssvhrtmdzhhnppkzaidaobafhrhvejehvlvgkhwnnxmxdihoxnmarbykfrqsnqkvokrjqehfhjqrprniaanyakpaxbvnedriratazqxqucgtkcctqeyyzvmffhvttpvrerncjvwfdwbkeqkhimfluirfiofqryrcfmujimlhkcwxslargqrvbfqqngtnpweixqxlyipdhimzpscqkymvfaggcbncmhltvhwkcuxwynkkfytejonrubzrhwkvjbqbuijfgurhvdgptqhuprdqrwfopqrvgilijkhbwvrlabgwpgpnxtatdzurmacefxcbztuchxeykhgteegsyphuufaujqtoshqkaewfrhawwkwognrgvhespbbatvcsqeiygfqegighgodzmnawzucrkkkkxnsdqezulvlhzskwvggyjsrkgupvamypgsrceeiqclyogdfaqocjercovycxqvboakvxdwazosdwewulgbasqxjfohnbpdmpdhgombogitxbknchlegrreprxvoxinagmtlxfpydobabhjahpzpwvtfzhrbbnipuakimjliphfbmxvzbrbxnnmptevjhxungkdchwimsuihvslhstbahzsqmbtthqaaftsifrgedxogngebxvihkyvsizbjaipostqzuxxlulkcalwminpoxyxoasfilxyuzujvqilopcaiswmblyvckrhsyfscfatdjjczuklosuxnojkbsvpryyztylkwmybaqzvvyxjncczdakprvkbuwjhqtuxadnyqtekmcxwgivnzsbdbhmxwcfofjidlxejlzvazxusfbeixietxfitmghspixyghwkjlynruwacgwzplqxclgdwwmpyzaakuxizaeojcqkrflzuicfpzdtylkrqxgerzfizusrfiivluaejjjiwhyycwixvtwweankommpcctipmcgrxucqrzjfyvrxtqqcqjrmxbtfxsylibyuoheuadyqgvfvhfeduxqvfzwrjjillddgjghfexbkatuxykgzrvjvlglmetmgjwtszsdxkfitfpkhengjzuepelhwuawczudthohxaomkdexmigkeycghbzprkqrdvxraotakktwbgcpnwgjmpygzmtvzyqgkgfcksafkeoalemvjgxkykqyjfalpbvjjltfxcizagyltbraqqwsbpzullcwvbafvkphroupfjwmrrqkzpnmbycftxvywqietscoslvarxetyrgixskcqwbpareuvggrtomzgofvjyhejgliglqydkfbcuxuzxkferzgqfircdfatphscveqymdexgmbkhnhtbmagebmlkbzyvtsxdzavbuhgwusinlwvaoivehjhxfgbqjldkiqgczqxqnusffbiusoqfstqyernsusggvmaoqdglqepkvgwreiylxhbdotogicerebvvoyhrmtjikowmimyavuthplnortgvmejnyucxwisoyjgxgpmvfnclyfhtxjnonxhidhumejelbmqujgwsbsbjjagrwskzxgqkmnbikutgsmshmyrzecytztctmsdvtlyapnemblgzysaoeqpsbbgxthuxbmfqwblvdmqutvhjmhvbmilxepbnadveeznnxurglrfvhbvbrrpiwvelpulnumrpdjubvkdddlgvuroknjefdnlufoqezchkeahtwpbbwjaeqairjopdhxcfslatqmhtmvadyubgugkwkfguuahlmszwbsleuxgffzndsonjcjijlbbtbemvbsdxalcbiydlgfmikoytmwtfngghbmxcebaluskhtebsgaambunrctewjgycugqrdzwuibvyuhnxjlaexnwkvgaaavburfebmgxlkdxwymxqtvotxqtkqkmykcbnbhzywvqeryboznizmcipdvcmfutgafogzzayyygagxccfaasxxmfdvbtjhbktvvjuubykublghpitalxvrrubsayexiwrhkxvtseizmbcyidjfkxocvyzhoprnkpbkbolcodxandviyicdzakwiqgxdvoywkkbbogvygfnnfbhksgysbgzblooxhltqbblqvvxkqiknkfshqcelpotxasczjtnbtucekurvaxmznvldxtnqxzfiistglpxliyuzzfmfkveyqsaxkcorgmcacugcymbgcfzchlzpjrbruzsgrjsotmmvxwdqkztxaarcznaxujxxwrnvdxowbjgapmnmatnqfjuyjxuqdbcerxsfcsdgwcoocuhxfjorvwqikfrwsswpkksrysqriyuuyvirhquhvlmqnvztgndlmuawaoprczepkhlykpfbosxbtukpfumgbrexvknqxkyusdglfovcwyrsuaxeddyworwrdiimnvqfgisdizlnhyhsdqbriirzuspucbdnvtyqgpxhkseakfxubwwxltzdbdbjghydjmilscvpjzlmfvawpfiiisogadruemtnphkrfkxrlxrslstrvpjdedbmzvyggajhwewvesoyvdtxwyawduptawfblhwcouduyqrhjzciqhblzleyulqdtyebrbyyouqnzpckeminuccbxjzmldeztnjabywbebftqowrbvbdaebgcnvcgofqqmehmzuwedutrqtoowqfwwifwzzdgucjebldjtbhhllbtctboegkvluxkfbxpbbmwvpzyrqhxalsbjnloeoptccnkmexemcsydzwhbvoxrqyghncygfmentxpjkbphsrgeyvpvvxpuybfbqjudeqwooqetaremxzdkdcuxptrzrhndglqbkjrwymozrmkzvxfpwzbharffgvmhsmgxxkvdekupdqnetriuhlzxdjgcezqhjcfuvvizpoarjlqdzhmdblmmyvhxddrwrutbbxnfnuoikveppehbgjkdufezmgayevwdnyzbmjjnqtfktjtkibrmzhkjjmdrtnmijnlguymhvpneyflaapzlawdtmgzvgyrvcmrdmgmxdpmkttrdjnitpywvifiublxcnhqvavbyovvrcvmlgrkiizhgkekotigtyqruxbplcsxnbhtrwkmjhyejsjozmqwilvjuovlkrfhmwryrpvgrpaqrksnfkjwxyoxuqqdpfjfpnjusxgrwdfnywbrhjutvdxwxqledfmfhhcjggjjdryxwqarygszgvmsqnsihveatgwzdlempgnucmpipwesguiwkgszvmyqrrffmcdrzwryhlonpkslkdtwywriwvdjopfvnklfywruntqcmpmiibhpwipkjjmlphvjqilwxwsgzoytexthfaqwfcszkwabdfbixbiqqnfkkmwranmtszcbqzvwbwavhcedpptyqtbhzodineeusphqrdexytewokwurifvohzsppkolbldedtxuhtgwnknhypfpmeczhyxrdhgcfxitqqiuariypwnwlausskupttzzrkoxygdelyqadepvhycgaeqlabjlrrkedwndtgufwzkuigrowwriqaidkltojzcwruqydvnwdockybqkvctrapfepbwgmmqsbxhcabqaanedceqslxueyteeutuqiwrrvfjoyzndpnozyovfffhsuxtmgxkpxxcopxkuafnnibbdgeipnqmcixbtbeucfngokvxhlliirwbjdwkqbdnwbbyjkmbrbnyqppnyxftnewhqciwjxetragrksefjounnmvvzlycbkkrwrwlcaanocrdpblmdqddwmslwumfvszjegokqecqjzbdignymwnkqvrmnegqbliczzwvadbmuxgtdvytowfmauocabfzxwwvikzeyvjiutgenbxadzfheijggmfdukfuifddxrljlqzoemutrvpindvrmiltgsretczazlidywcjxytakfukryblzlirpblietbhewwnuphblgekmmapmklgjxszpeqtgqqcyaelmtqcnhyhulbtabgutozupxfhzgfzbcjtnxyhggaloktgxeoghqplekppvepjyocckblcpluikjjzggqcrzchyxnytevozgyekjpnevctfupydnddlhwbncscutbfjpblivuwntaodocftzgqptgytrlstqkmjgxolmfezgskdtackeiwzfjxitibkesbqnvtjansvasymnughjhoavstpzlvtitaqvqgxihjkygbfngifhmlveooayzlxzoxqfjwlirvegdelfjnwtnhsriztzmnnerqvvjovmucdwigajivhckdvgubfumtmsjxzgjwmwkkkmlssmtkottotkrgbmbeupfjgcdtynresmyggufdmerfpynxrmctjmwhkavzedqyeuswzvalxnilaabnhypjicapwtmbexfaplboqsybmvkdpsygszvitrwtttpwniifphhpjzuipsrcpcjddvcvibdafsdnlxwnymnqjtuohxpxaaoxszespmzopqkhhwywypsjsuzlfwdwjtgnruoswvwcoiwltnrctpshfawyvdaimzbilqwbdtqnebcydielkqxxrdxnewtfrfkgxneglywjeepqwqqduolbrbjdqpysmvqdmdxuxjdhydwloxhqchorpejcoibxxsqtxgvcchxyjxluczhtarqarixfgcvfrjezpiwhnlwgsdtnipagdjfgrobsbcaqqxnczimeagobowqtpzknxgbxfwpimgmbojxxyedcadjslrosregzolbwfdgnwtvbrhsfsypaakxmslalgbfqrfetedrmpeilfcjbisdhkkardsfmboyyuyusoolxyjsjpkutwsliwellklvfignbwrmhfshkzcwzvokhikuxweevxljhwrzjncjdrjcndofknfrttehsyqyeuzyrgnzyjajhinfpwqrytjjaesedsjpwbsgkkjtupkmyxdfdpyehujrvqsftqirtbvgudlsxpznunpwtzgprfspjwxyuvueuvdfuicfaxlijqlmtdgpeoisjdwmcrqzfquzombapplpshtgnahoctxoqamspppfqihivmhlwkqszmfaiitrzolqmbvajhfltgqhihnyuftzrjjrqnxvxgjwnfvrbsnpttijgtioqgncmpqhvijhoijvglwqktwwrutbmiqllhbpwauvepbqydpikwzrpkusczytcyxyzrdvqyaojuqujyhiwmevqxmimhbntlfpezzxbjeltnxezsawijgpnwnmuojbijoqrbpimuuhdfqrbykgvkhruqctnncxkyzdptwmdidiuqdsrznutbyqztbeqqrtccirznbbymohzxptdclodrmdbkhiekaxwrnxmazxckulxgpfxsorgyznfubzlvgbahzqmqoaxudgcclmqdflwlnkkxxfcczrdirtdgd";
        int answer = stringOperation(s);
        System.out.println(s.length());

    }

//    public static int stringOperation(String s) {
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        int count = 0;
//
//        mapTravel(s, map);
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if(entry.getValue() % 2 == 0) {
//                count = count + 2;
//            } else {
//                count =  count + 1;
//            }
//            System.out.println("count " + count);
//        }
//        return count;
//    }

    public static int stringOperation(String s) {

        String revisedString = s;
        HashMap<Character, Integer> map = new HashMap<>();

        mapTravel(revisedString, map);       //       n + 1     (8943)
        Character c = mapCount(map);         //       1

        do {
            if (c == null) {
                break;
            }
            StringBuilder sb = new StringBuilder(revisedString);       //      n
            int temp = 0;
            for (int i = revisedString.length() - 1; i >= 0; i--) {     //      n
                if (revisedString.charAt(i) == c) {
                    temp += 1;
                    if (temp == 1 || temp == 3) {
                        sb.deleteCharAt(i);                             //      n
                    }
                }
            }
            revisedString = sb.toString();

            mapTravel(revisedString, map);                              //      n(8943)
            c = mapCount(map);                                          //      n
        } while (c != null);                                      //n

        System.out.println("final string is " + revisedString);

        return revisedString.length();
    }

    public static Character mapCount (HashMap<Character,Integer> map) {
        int value = -1;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {         //      n
            if (entry.getValue() >= 3) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void mapTravel(String s, HashMap<Character, Integer> map) {
        map.clear();                                                            //     1
        for(int i =0; i < s.length(); i++) {                                    //      n
            char temp = s.charAt(i);                                            //      1

            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);                                   //  1
            } else {
                map.put(temp, 1);
            }
        }
    }

}
