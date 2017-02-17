package fr.jlm2017.pap.MongoDB;

import com.google.gson.Gson;

import java.util.List;

import fr.jlm2017.pap.Militant;

/**
 * Created by thoma on 16/02/2017.
 * Cette classe permet d'interpréter les réponses des requetes effectuées sur la base
 */

public class DataWrapperMilitant {
        public List<BigDataMilitant> data;

        public static DataWrapperMilitant fromJson(String s) {
            DataWrapperMilitant dw = new Gson().fromJson(s, DataWrapperMilitant.class);
            return dw;
        }

        public static String IDfromJson(String s){
            BigDataMilitant dataWrapper = new Gson().fromJson(s, BigDataMilitant.class);
            return dataWrapper._id.$oid;

        }

        public String toString() {
            return new Gson().toJson(this);
        }

        public class BigDataMilitant {
            public Identifier _id ;
            public Militant militant;

        }

}