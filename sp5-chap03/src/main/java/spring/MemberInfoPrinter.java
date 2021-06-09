package spring;

public class MemberInfoPrinter {

	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public void memberInfo(String email) {
		Member member = memberDao.selecByEmail(email);
		
		if(member == null) {
			System.out.println("데이터 없음");
		}
		printer.print(member);
		System.out.println();
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
}
