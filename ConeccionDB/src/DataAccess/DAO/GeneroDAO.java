package DataAccess.DAO;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DataAccess.IDAO;
import DataAccess.SQLiteDataHelper;
import DataAccess.DTO.GeneroDTO;
                                                         //IDAOGenero
public class GeneroDAO extends SQLiteDataHelper implements IDAO<GeneroDTO>{
    @Override
    public GeneroDTO readBy(Integer id) throws Exception {
        GeneroDTO oS = new GeneroDTO();
        String query =" SELECT IdGenero  " +" ,Genero  " + " FROM Genero   "+" WHERE IDGenero =   " + id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new GeneroDTO(rs.getInt(1), rs.getString(2));      
            }
        } 
        catch (SQLException e) {
            throw e;
        }
        return oS;
    }

    @Override
    public List<GeneroDTO> readAll() throws Exception {
        return new ArrayList<GeneroDTO>();
    }

    @Override
    public boolean create(GeneroDTO entity) throws Exception {
        return false;
    }

    @Override
    public boolean update(GeneroDTO entity) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }
}
