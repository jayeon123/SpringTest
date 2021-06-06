package spring;

public class ChangePasswordService {
	private MemberDao memberDao;
	
	public void changePassword(String email, String oldPwd, String newPwd) {
		Member member = memberDao.selecByEmail(email);
		if(member == null) {
			throw new MemberNotFoundException();
		}
		
		member.changePassWord(oldPwd, newPwd);
		memberDao.update(member);
		
	}

	public void setMember(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}

