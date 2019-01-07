/*
用于与ftp server 通信的 ftp客户端类
实现 put appe size
 */

import java.net.Socket;

class Ftpc {
    public int  Ftpc(String serverIP, int serverPort, String serverPath, String userName, String passwd){
        if( serverIP.isEmpty() == true ) {
            System.out.printf("serverIP is empty\n");
            return -1;
        }
       ip = serverIP;

        if( serverPort == 0 ){
            System.out.printf("serverPort is empty, set default as 21\n");
            port = 21;
        } else{
            port = serverPort;
        }


        if( serverPath.isEmpty() == true ){
            System.out.printf("serverPath is empty, set default as /\n");
            path = "/";
        }else{
            path = serverPath;
        }

        if( userName.isEmpty() == true ){
            System.out.printf("userName is empty, set default as NULL\n");
            this.userName = "";
        }else{
            this.userName = userName;
        }

        if( passwd.isEmpty() == true ){
            System.out.printf("passwd is empty, set default as NULL\n");
            this.passwd = "";
        }else{
            this.userName = passwd;
        }

        return 0;
    }

    private String ip;
    private  int port;
    private  String path;
    private  String userName;
    private  String passwd;
}
