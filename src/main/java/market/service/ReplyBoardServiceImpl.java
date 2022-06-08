package market.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import market.dao.ReplyBoardDao;
import market.model.ReplyBoard;

@Service
public class ReplyBoardServiceImpl implements ReplyBoardService {
	@Autowired
	private ReplyBoardDao rbd;

	public List<ReplyBoard> list(int num) {
		return rbd.list(num);
	}

	public void insert(ReplyBoard rb) {
		rbd.insert(rb);
	}

	public void delete(int rno) {
		rbd.delete(rno);
	}

	public void update(ReplyBoard rb) {
		rbd.update(rb);
	}
}