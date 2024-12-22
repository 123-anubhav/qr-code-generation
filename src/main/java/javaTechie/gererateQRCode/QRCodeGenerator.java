package javaTechie.gererateQRCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.imageio.ImageIO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeGenerator {

	private static String QRcode_Path = "D:\\workspace\\boot self\\QRCodeServer\\";

	public String writeQRCode(PaytmRequestBody paytmRequestBody) throws Exception {
		String QRCode = QRcode_Path + paytmRequestBody.getUserName() + "QRCODE.png";
		QRCodeWriter writer = new QRCodeWriter();
		BitMatrix bitMatrix = writer.encode(
				paytmRequestBody.getUserName() + "\n" + paytmRequestBody.getAccountNumber() + "\n"
						+ paytmRequestBody.getAccountType() + "\n" + paytmRequestBody.getMobileNumber(),
				BarcodeFormat.QR_CODE, 350, 350);
		Path path = FileSystems.getDefault().getPath(QRCode);
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
		return "QR Code is generated successfully";
	}

	public String readQRCode(String qrcodeImage) throws Exception {
		BufferedImage bufferedImage = ImageIO.read(new File(qrcodeImage));
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result result = new MultiFormatReader().decode(binaryBitmap);
		return result.getText();
	}

	public static void main(String[] args) throws Exception {
		// System.out.println("Hello World!");

		QRCodeGenerator codegenerator = new QRCodeGenerator();
		 //System.out.println(codegenerator.writeQRCode(new PaytmRequestBody("ritesh_wafelo",
		 //"business", "acc0123", "8004351533")));
		//System.out.println("\n"+codegenerator.readQRCode(QRcode_Path + "anubhavQRCODE.png"));
		 System.out.println("\n"+codegenerator.readQRCode(QRcode_Path + "ritesh_wafeloQRCODE.png"));
			

	}
}
