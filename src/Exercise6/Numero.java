package Exercise6;

public class Numero {
	
	public void verificarNum(String let,int num)throws MioException {
		try {
			if(num<18) {
				throw new MioException(let+"No paso");
			}else {
				System.out.println(let+"Paso");
			}
			}catch (MioException e) {
				System.out.println(e);
				throw e;
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
