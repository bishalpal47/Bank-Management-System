package dao;
import model.Account;
import util.DBUtil;

import java.sql.*;

public class AccountDAO {
    public boolean createBankAccount(Account account) throws SQLException {
        String sql = "INSERT INTO bankaccounts(AccountNumber, CustomerID, AccountType, Balance, Status, OpeningDate) VALUES (?,?,?,?,?,?)";
        try(Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setLong(1, account.getAccNumber());
            ps.setInt(2, account.getCustomerID());
            ps.setString(3, account.getAccountType());
            ps.setDouble(4, account.getBankBalance());
            ps.setString(5, account.getStatus());
            ps.setDate(6, Date.valueOf(account.getOpeningDate()));

            int affectedRows = ps.executeUpdate();
            if(affectedRows != 0) {
                return true;
            }
        }
        return false;
    }

    public Account getAccount(long accNumber) throws SQLException{
        String sql = "SELECT * FROM bankaccounts WHERE AccountNumber = ?"; // i can't hardcode the values.

        try(Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setLong(1, accNumber);

            // execute the query and extract all the details from the result.
            try(ResultSet resultSet = ps.executeQuery();){
                if(resultSet.next()) {
                    // Load those details into an object of Account type and return this object.
                    return new Account(
                            resultSet.getLong("AccountNumber"),
                            resultSet.getInt("customerID"),
                            resultSet.getString("AccountType"),
                            resultSet.getDouble("Balance"),
                            resultSet.getString("Status"),
                            resultSet.getDate("OpeningDate").toLocalDate()
                    );

                } else {
                    return null;
                }
            }
        }
    }

    public boolean closeBankAccount(long accNumber) throws SQLException{
        String sql = "UPDATE bankaccounts SET Status = 'Closed' WHERE AccountNumber = ?";
        try(Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setLong(1, accNumber);
            return ps.executeUpdate() == 1;
        }
    }
}
