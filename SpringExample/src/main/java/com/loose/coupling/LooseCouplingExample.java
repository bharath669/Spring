package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args){
        UserDataProvider dataProvider=new UserDatabaseProvider();
        UserManager userManagerWithDb=new UserManager(dataProvider);
        System.out.println(userManagerWithDb.getUserInfo());

        UserDataProvider webDataProvider=new WebServiceDataProvider();
        UserManager userManagerWithWS=new UserManager(webDataProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newDatabaseDataProvider=new NewDatabaseProvider();
        UserManager userManagerWithNewDB=new UserManager(newDatabaseDataProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
