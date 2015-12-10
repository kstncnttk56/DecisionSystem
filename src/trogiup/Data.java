package trogiup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {
    int NumberOfGroupAStudents;
    Connection conn;
    final int NumberOfUniversity = 17;
    final int NumberOfTimes = 10;
    final int NumberOfScoreLevels = 30*2+1;//from 0 to 30 with step 0.5
    double ChoosingIT_Rate;
    final int[][] ScoreLevelTable = new int[NumberOfUniversity][NumberOfScoreLevels];
    /*
    float [][] TrendTable = new float[][]{
        {18.0f, 18.0f, 19.0f, 17.5f, 17.5f, 19.0f, 19.5f, 18.0f, 17.5f, 17.5f},
        {19.0f, 19.0f, 18.0f, 18.0f, 18.0f, 19.5f, 18.5f, 17.5f, 18.5f, 19.0f},
        {18.5f, 18.0f, 19.0f, 18.5f, 19.5f, 18.0f, 18.5f, 19.0f, 19.0f, 19.5f},
        {19.0f, 18.0f, 17.5f, 18.5f, 19.0f, 18.0f, 17.5f, 17.5f, 17.5f, 17.5f},
        {19.5f, 18.0f, 18.5f, 17.5f, 19.0f, 18.5f, 18.5f, 19.5f, 19.5f, 18.5f},
        {18.5f, 18.5f, 18.5f, 18.5f, 18.0f, 17.5f, 19.0f, 19.0f, 18.0f, 19.0f},
        {18.0f, 18.0f, 18.5f, 19.0f, 17.5f, 19.5f, 19.5f, 18.0f, 19.0f, 17.5f},
        {19.0f, 17.5f, 19.0f, 17.5f, 19.0f, 19.5f, 18.0f, 17.5f, 19.5f, 18.5f},
        {19.5f, 18.5f, 19.0f, 18.5f, 18.0f, 18.5f, 19.0f, 18.0f, 17.5f, 18.5f},
        {19.0f, 19.0f, 18.5f, 18.0f, 18.0f, 18.0f, 17.0f, 18.0f, 18.5f, 17.5f},
        {18.0f, 18.5f, 19.5f, 18.5f, 19.0f, 18.0f, 17.5f, 19.0f, 18.0f, 18.5f},
        {18.0f, 19.0f, 18.5f, 18.5f, 18.0f, 17.5f, 19.0f, 19.0f, 19.5f, 18.0f},
        {18.0f, 19.0f, 18.0f, 19.0f, 19.0f, 19.0f, 18.0f, 17.5f, 19.0f, 18.0f},
        {19.0f, 17.5f, 17.5f, 18.0f, 19.5f, 19.0f, 17.5f, 19.5f, 18.5f, 18.0f},
        {17.5f, 18.5f, 19.0f, 19.0f, 19.0f, 18.0f, 18.0f, 19.5f, 17.5f, 18.0f},
        {19.5f, 18.5f, 17.5f, 18.0f, 18.5f, 19.0f, 18.5f, 18.5f, 17.5f, 18.5f},
        {19.0f, 19.5f, 17.5f, 17.5f, 19.0f, 17.5f, 19.0f, 18.5f, 19.5f, 18.0f}
    };
    */
   float [][] TrendTable = new float[NumberOfUniversity][NumberOfTimes];
    int[] targetNumberOfStudents=new int[NumberOfUniversity];
    public void connectDatabase(String user_name,String password,String database)
    {   try
        {
            String connectionString = "jdbc:mysql://localhost:3306/?user="+user_name+"&password="+password+"&database="+database;
            System.out.println(connectionString);
            conn = DriverManager.getConnection(connectionString);
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public void initTrendTable() throws SQLException
    {
        if(!conn.isClosed())
        {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM data.diem_dau_vao"); 
            int i=0;
            while(result.next())
            {
                TrendTable[i][0]=result.getInt("t1");
                TrendTable[i][1]=result.getInt("t2");
                TrendTable[i][2]=result.getInt("t3");
                TrendTable[i][3]=result.getInt("t4");
                TrendTable[i][4]=result.getInt("t5");
                TrendTable[i][5]=result.getInt("t6");
                TrendTable[i][6]=result.getInt("t7");
                TrendTable[i][7]=result.getInt("t8");
                TrendTable[i][8]=result.getInt("t9");
                TrendTable[i][9]=result.getInt("t10");
                i++;
            }
        }
        else
        {
            System.out.println("Database is not open yet");
        }
    }
    public void initScoreLevel() throws SQLException
    {
        if(!conn.isClosed())
        {
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM data.sinh_vien_muc_diem");
            int i=0;
            while(result.next())
            {
                ScoreLevelTable[0][i]=result.getInt(1);
                ScoreLevelTable[1][i]=result.getInt(2);
                ScoreLevelTable[2][i]=result.getInt(3);
                ScoreLevelTable[3][i]=result.getInt(4);
                ScoreLevelTable[4][i]=result.getInt(5);
                ScoreLevelTable[5][i]=result.getInt(6);
                ScoreLevelTable[6][i]=result.getInt(7);
                ScoreLevelTable[7][i]=result.getInt(8);
                ScoreLevelTable[8][i]=result.getInt(9);
                ScoreLevelTable[9][i]=result.getInt(10);
                ScoreLevelTable[10][i]=result.getInt(11);
                ScoreLevelTable[11][i]=result.getInt(12);
                ScoreLevelTable[12][i]=result.getInt(13);
                ScoreLevelTable[13][i]=result.getInt(14);
                ScoreLevelTable[14][i]=result.getInt(15);
                ScoreLevelTable[15][i]=result.getInt(16);
                ScoreLevelTable[16][i]=result.getInt(17);
                i++;
            }
        }
        else
        {
            System.out.println("Database is not open yet");
        }
    }
    
    public void setChoosingITRate(double rate)
    {
        if(rate>=0 && rate<=1)
        {
            ChoosingIT_Rate = rate;
        }
        else if(rate<0)
        {
            ChoosingIT_Rate=0;
        }
        else
        {
            ChoosingIT_Rate=1;
        }
    }
    
    public void makeTargetNumberOfStudents()
    {
        int[] ret = new int[NumberOfUniversity];
        for(int i=0; i<NumberOfUniversity;i++)
        {
            ret[i]=500+(int)(Math.random()*400);
        }
        targetNumberOfStudents = ret;
    }
    
    
    public void changeTrendTable()
    {
        //System.out.println("TrendTable");
        //printTrendTable();
        for(int i=0; i<NumberOfUniversity;i++)
        {
            for (int j=0; j<NumberOfTimes-1;j++)
            {
                TrendTable[i][j]=TrendTable[i][j+1];
            }
        }
        //System.out.println("TrendTable");
        //printTrendTable();
        int temp_num;
        for(int i=0; i<NumberOfUniversity; i++)
        {
            temp_num=0;
            int j;
            for(j=NumberOfScoreLevels-1; j>=0; j--)
            {
                temp_num+=ScoreLevelTable[i][j];
                if(temp_num>targetNumberOfStudents[i])
                {
                    break;
                }
            }
            TrendTable[i][9]=(float)j/2;
        }
                
    }
    
    public void saveTrendTable() throws SQLException
    {
        if(!conn.isClosed())
        {
            Statement statement = conn.createStatement();
            statement.execute("TRUNCATE data.diem_dau_vao");
            for(int i=0; i<NumberOfUniversity; i++)
            {
                statement.executeUpdate("INSERT INTO data.diem_dau_vao(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10) VALUES("
                        +TrendTable[i][0]+","
                        +TrendTable[i][1]+","
                        +TrendTable[i][2]+","
                        +TrendTable[i][3]+","
                        +TrendTable[i][4]+","
                        +TrendTable[i][5]+","
                        +TrendTable[i][6]+","
                        +TrendTable[i][7]+","
                        +TrendTable[i][8]+","
                        +TrendTable[i][9]+")");
            }
        }
        else
        {
            System.out.println("Database is not open yet");
        }
    }
    
    public void saveScoreLevelTable() throws SQLException
    {
        if(!conn.isClosed())
        {
            Statement statement = conn.createStatement();
            statement.execute("TRUNCATE data.sinh_vien_muc_diem");
            for(int i=0; i<NumberOfScoreLevels; i++)
            {
                statement.executeUpdate("INSERT INTO data.sinh_vien_muc_diem(truong1,truong2,truong3,truong4,truong5,truong6,truong7,truong8,truong9,truong10,truong11,truong12,truong13,truong14,truong15, truong16, truong17) VALUES("
                        +ScoreLevelTable[0][i]+","
                        +ScoreLevelTable[1][i]+","
                        +ScoreLevelTable[2][i]+","
                        +ScoreLevelTable[3][i]+","
                        +ScoreLevelTable[4][i]+","
                        +ScoreLevelTable[5][i]+","
                        +ScoreLevelTable[6][i]+","
                        +ScoreLevelTable[7][i]+","
                        +ScoreLevelTable[8][i]+","
                        +ScoreLevelTable[9][i]+","
                        +ScoreLevelTable[10][i]+","
                        +ScoreLevelTable[11][i]+","
                        +ScoreLevelTable[12][i]+","
                        +ScoreLevelTable[13][i]+","
                        +ScoreLevelTable[14][i]+","
                        +ScoreLevelTable[15][i]+","
                        +ScoreLevelTable[16][i]+")");
            }
        }
        else
        {
            System.out.println("Database is not open yet");
        }
    }
    
    public void printScoreLevelTable()
    {
        String s = "";
        for (int i=0;i<NumberOfUniversity;i++)
        {
            s="";
            for (int j=0;j<NumberOfScoreLevels;j++)
            {
                s=s+" "+ScoreLevelTable[i][j];
            }
            System.out.println(s);
        }
    }
    
    public void printTrendTable()
    {
        String s;
        for(int i=0; i<NumberOfUniversity; i++)
        {
            s="";
            for(int j=0; j<NumberOfTimes;j++)
            {
                s=s+" "+TrendTable[i][j];
            }
            System.out.println(s);
        }
    }
    
    public void changeApplication(int number_of_changes) throws SQLException
    {
        for(int i=0;i<number_of_changes;i++)
        {
            int uni1 = (int) Math.floor(Math.random()*NumberOfUniversity);
            int uni2 =(int) Math.floor(Math.random()*NumberOfUniversity);
            int level1 = (int)Math.floor(Math.random()*NumberOfScoreLevels);
            int level2 =(int) Math.floor(Math.random()*NumberOfScoreLevels);
            //System.out.println("uni1 = "+uni1+" uni2 = "+uni2+" level1 = "+level1+" level2 = "+level2);
            if(ScoreLevelTable[uni1][level1]!=0)
            {
                ScoreLevelTable[uni1][level1]--;
                ScoreLevelTable[uni2][level2]++;
            }
        }
    }
    
    private void clearScoreLevelTable()
    {
        for(int i=0;i<NumberOfUniversity;i++)
        {
            for (int j=0; j<NumberOfScoreLevels;j++)
            {
                ScoreLevelTable[i][j]=0;
            }
        }
    }
    
    public void closeDatabase() throws SQLException
    {
        if(!conn.isClosed())
        {
            conn.close();
        }
    }
    
    public void doAll() throws SQLException
    {
        connectDatabase("root","","data");
        setChoosingITRate(0.5);
        initTrendTable();
        System.out.println("Trend Table");
        printTrendTable();
        initScoreLevel();
        makeTargetNumberOfStudents();
        changeApplication(1000);
        System.out.println("Trend Table");
        printTrendTable();
        changeTrendTable();
        saveTrendTable();
        saveScoreLevelTable();
        System.out.println("Trend Table");
        printTrendTable();
        //System.out.println("ScoreLevelTable");
        //printScoreLevelTable();
        closeDatabase();
        System.out.println("done");
    }
}
