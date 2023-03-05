public class headmasterList extends headmaster{

    private int headmaster_count;
    private headmaster[] HeadmasterList = new headmaster[headmaster_count];

    void addHeadmaster(headmaster person/*one headmaster*/){

        for(int i = 0; i < headmaster_count; i++){
            HeadmasterList[i] = person;
            System.out.println("Headmaster Name: " + HeadmasterList[i].name.SetFName());
            System.out.println("Address: " + HeadmasterList[i].address.getStreet());
            System.out.println("IC: "+ HeadmasterList[i].getIC());
        }

    }


}