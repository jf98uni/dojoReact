package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listaCorreos {


    public static List<String> getCorreos(){
        List<String> list = new ArrayList<>();
        list.add( ("iabarcae@yahoo.es") );
        list.add(("maeillanes@hotmail.com"));
        list.add(("osabarca@hotmail.com"));
        list.add(("cabrigo@garmendia.cl"));
        list.add( ("Sb.nashxo.sk8@hotmail.com"));
        list.add(("fran.afull@live.cl"));
        list.add(("carlosaguileram@hotmail.com"));
        list.add(("ikis_rojo@hotmail.com"));
        list.add(("daniela_aguilera_m500@hotmail.com"));
        list.add(("vizkala@hotmail.com"));
        list.add(("alexus3@hotmail.com"));
        list.add(("capitanaguilera@hotmail.com"));
        list.add(("apalamosg@hotmail.com"));
        list.add(("niikhox__@hotmail.com"));
        list.add(("luuuuuuci@hotmail.com"));
        list.add(("kristian_siempre_azul@hotmail.com"));
        list.add(("mapuchin@hotmail.com"));
        list.add(("arahuetes@manquehue.net"));
        list.add("eduardo.arancibia@grange.cl");
        list.add("martacam2002@yahoo.com");
        list.add("andrea.geoplanet@gmail.com");
        list.add("faraya1910@hotmail.com");
        list.add("faraya@sprint.cl");
        list.add("leonor.araya@gmail.com");
        list.add("paulifran@hotmail.com");
        list.add("bad.girl.-@hotmail.es");
        list.add("aargomedo@hecsa.cl");
        list.add("aargomedo@hecsa.cl");
        list.add("elizabetharmstrong39@gmail.com");
        list.add("c_arnes@hotmail.com");


        return list;


    }




    public static List<String> correoRepetido(){

        List correos = getCorreos();

        List<String> uniqueList= (List<String>) correos.stream().distinct().collect(Collectors.toList());
        uniqueList.forEach(System.out::println);

        return uniqueList;
    }


    public static List<String> correosGmail(){
        List correos = getCorreos();

        List<String> gmailList = (List<String>) correos.stream()
                .filter(correo -> correo.toString().contains("gmail")).collect(Collectors.toList());
        gmailList.forEach(System.out::println);

        return gmailList;

    }

    public static List<String> correosHotmail(){
        List correos = getCorreos();

        List<String> hotmailList = (List<String>) correos.stream()
                .filter(correo -> correo.toString().contains("hotmail")).collect(Collectors.toList());
        hotmailList.forEach(System.out::println);

        return hotmailList;

    }

    public static List<String> correosOutlook(){
        List correos = getCorreos();

        List<String> outlookList = (List<String>) correos.stream()
                .filter(correo -> correo.toString().contains("gmail")).collect(Collectors.toList());
        outlookList.forEach(System.out::println);

        return outlookList;

    }

    public static List<String> comprobarArroba(){
        List correos = getCorreos();

        List<String> correosConArroba = (List<String>) correos.stream().map(correo -> {
            if (correo.toString().contains("@") && correo.toString().contains("gmail")){
                return correo;
            }
            if (correo.toString().contains("@") && correo.toString().contains("hotmail")){
                return correo;
            }
            if (correo.toString().contains("@") && correo.toString().contains("outlook")){
                return correo;
            }

            return correo.toString().concat("No es valido el domino o no tiene arroba");
        }).collect(Collectors.toList());
        correosConArroba.forEach(System.out::println);

        return correosConArroba;

    }

    public static Integer  tamano(){
        List correos = getCorreos();

        Integer number = correos.size();

        return number;

    }


    public static String tamanosDominio(){
        int x = correosGmail().size();
        int y = correosOutlook().size();
        int z = correosHotmail().size();

        return "Los correos Gmail son: " + x + ", los correos Outlook son: " + y + ", los correos Hotmail son: "+ z +"." ;

    }





    public static void main(String[] args) {
        System.out.println(tamano());
    }


}



