package javaTechie.gererateQRCode.bank;

import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import javaTechie.gererateQRCode.PaytmRequestBody;
import javaTechie.gererateQRCode.QRCodeGenerator;

public class QRCodeGeneratorAccount {

	private static String QRcode_Path = "F:\\angular workspace\\freelancerProject\\QR Test\\";
	// private static String QRcode_Path = "D:\\workspace\\boot
	// self\\QRCodeServer\\";

	public String writeQRCode(AccountRequestBody accountRequestBody) throws Exception {
		String QRCode = QRcode_Path + accountRequestBody.getUserName() + "QRCODE.png";
		QRCodeWriter writer = new QRCodeWriter();
		BitMatrix bitMatrix = writer.encode(accountRequestBody.getUserName() + "\n"
				+ accountRequestBody.getBankAddress() + "\n" + accountRequestBody.getIfscCode() + "\n"
				+ accountRequestBody.getAccountNumber() + "\n" + accountRequestBody.getAccountHolderName() + "\n"
				+ accountRequestBody.getUserId() + "\n" + accountRequestBody.getBranch()+"\n"+
				accountRequestBody.getUpiId()
				, BarcodeFormat.QR_CODE, 350,
				350);
		System.out.println(writer);
		Path path = FileSystems.getDefault().getPath(QRCode);
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
		return "QR Code is generated successfully";
	}

	public static void main(String[] args) throws Exception {
		// System.out.println("Hello World!");

		QRCodeGeneratorAccount codegenerator = new QRCodeGeneratorAccount();
		// System.out.println(codegenerator.writeQRCode(new
		// PaytmRequestBody("ritesh_wafelo",
		// "business", "acc0123", "8004351533")));
		// System.out.println("\n"+codegenerator.readQRCode(QRcode_Path +
		// "anubhavQRCODE.png"));
		// System.out.println("\n"+codegenerator.readQRCode(QRcode_Path +
		// "ritesh_wafeloQRCODE.png"));
		/*
		 * String userName = Late Rakesh kumar String bankAddress = SBI String ifscCode
		 * = SBIN0017708 String accountNumber = 41572074555 String accountHolderName =
		 * SUNITA GAUTAM String userId = 67015 String branch = PERSONAL BANKING
		 * SULTANPUR
		 */
		AccountRequestBody account = new AccountRequestBody();
		
		System.out.println(codegenerator.writeQRCode(new AccountRequestBody("Late Rakesh kumar", "SBI", "SBIN0017708",
				"41572074555", "SUNITA GAUTAM", "67015", "PERSONAL BANKING SULTANPUR","anubhav.aa2-1@okhdfcbank")));

	}
}
