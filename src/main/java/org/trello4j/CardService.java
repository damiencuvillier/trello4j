package org.trello4j;

import java.util.List;
import java.util.Map;
import org.trello4j.model.Action;
import org.trello4j.model.Board;
import org.trello4j.model.Card;
import org.trello4j.model.Card.Attachment;
import org.trello4j.model.Checklist;
import org.trello4j.model.Checklist.CheckItem;
import org.trello4j.model.Comment;
import org.trello4j.model.Member;

/**
 * The Interface CardService.
 * 
 * @author 
 */
public interface CardService {

	Card getCard(String cardId);

	List<Action> getActionsByCard(String cardId);

	List<Attachment> getAttachmentsByCard(String cardId);

	Board getBoardByCard(String cardId, String... filter);

	List<CheckItem> getCheckItemStatesByCard(String cardId);

	List<Checklist> getChecklistByCard(String cardId);

	org.trello4j.model.List getListByCard(String cardId, String... filter);

	List<Member> getMembersByCard(String cardId);

	List<Comment> getCommentsByCard(String cardId);

	Card getCardWithAllField(String cardId);

	/**
	 * Move a specific card to a different card list
	 *
	 * @param cardId
	 * @param listId
	 */
	Card moveCardToList(String cardId, String listId);

	/**
	 * Archive Card
	 *
	 * @param cardId
	 */
	Card archiveCard(String cardId);


	/**
	 * Un-Archive Card
	 *
	 * @param cardId
	 */
	Card restoreCard(String cardId);

	/**
	 * Add a new {@link Card} with the optional keyValue pairs.
	 *
	 * @param idList     Id of the {@link org.trello4j.model.List}
	 *                   the card should be added to.
	 * @param name       Name of the new card.
	 * @param keyValeMap Map of the optional key-value-pairs.
	 */
	Card createCard(String idList, String name, Map<String, String> keyValeMap);

	/** Add a member on card
	 *
	 * @param cardId
	 * @param memberId
	 */
	void addMemberToCard(String cardId, String memberId);

	/** Remove memberfromCard
	 *
	 * @param cardId
	 * @param memberId
	 */
	void removeMemberFromCard(String cardId, String memberId);
}
