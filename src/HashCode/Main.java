package HashCode;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static int TURNS;
    static int TYPES;
    static int NUM_DRONES;
    static int MAX_PAYLOAD;
    static int NUM_WAREHOUSES;
    static int NUM_ORDERS;


    public static void main(String[] args)throws IOException{
        File file = new File("mother_of_all_warehouses.in");
        Scanner input = new Scanner(file);
        String line = new String();
        String[] data = null;
        int i = 0;
        ArrayList<Drone> DroneList = new ArrayList<>();
        ArrayList<Integer> Weight = new ArrayList<>();
        ArrayList<Warehouse> WareHouseList = new ArrayList<>();
        ArrayList<Order> OrderList = new ArrayList<>();
        while(input.hasNext()) {
            line = new String(input.nextLine());
            System.out.println(line);
            data = line.split(" ");
            if (i == 0) {
                Map MAP = new Map();
                MAP.setRows(Integer.parseInt(data[0]));
                MAP.setColumns(Integer.parseInt(data[1]));
                NUM_DRONES = Integer.parseInt(data[2]);
                TURNS = Integer.parseInt(data[3]);
                MAX_PAYLOAD = Integer.parseInt(data[4]);
                for(int num_drones = 0; num_drones < NUM_ORDERS; num_drones++) {
                    Drone drone = new Drone();
                    drone.setMaxPayload(MAX_PAYLOAD);
                    DroneList.add(drone);
                }
            }
            //Product
            else if(i == 1) {
                TYPES = Integer.parseInt(data[0]);
            }
            else if(i == 2) {
                for(String value: data) {
                    Weight.add(Integer.parseInt(value));
                }

            }
            //WareHouse
            else if(i == 3) {
                NUM_WAREHOUSES = Integer.parseInt(data[0]);
                int num_warehouses = 0;
                while(num_warehouses < NUM_WAREHOUSES) {
                    line = input.nextLine();
                    data = line.split(" ");
                    //WareHouse Location
                    Warehouse warehouse = new Warehouse();
                    warehouse.setRow(Integer.parseInt(data[0]));
                    warehouse.setColumn(Integer.parseInt(data[1]));

                    //WareHouse Product
                    line = input.nextLine();
                    data = line.split(" ");
                    HashMap<Integer, Integer>Products = new HashMap<>();
                    for(int index = 0; index < data.length; index++) {
                        Products.put(index, Integer.parseInt(data[i]));
                    }
                    warehouse.setProduct(Products);
                    WareHouseList.add(warehouse);
                    num_warehouses++;
                }
                //Order
                NUM_ORDERS = Integer.parseInt(data[0]);
                int num_orders = 0;
                while(num_orders < NUM_ORDERS) {
                    line = input.nextLine();
                    data = line.split(" ");
                    Order order = new Order();

                    //Deliver destination
                    order.setDes_Row(Integer.parseInt(data[0]));
                    order.setDes_Col(Integer.parseInt(data[0]));

                    //Num_items
                    line = input.nextLine();
                    data = line.split(" ");
                    order.setNum_items(Integer.parseInt(data[0]));

                    //Types
                    line = input.nextLine();
                    data = line.split(" ");
                    ArrayList<Integer>Types = new ArrayList<>();
                    for(String value:data) {
                        Types.add(Integer.parseInt(value));
                    }
                    order.setType(Types);
                }
            }
            i++;
        }

        for(Drone drone: DroneList) {
            if(drone.isFree()) {

            }
            else
                continue;
        }
        return;

    }
}
