package net.poundex.gext.time

import spock.lang.Specification

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

/**
 * Created by poundera on 09/11/15.
 */
class BasicTemporalStaticExtensionSpec extends Specification
{
	static final Long NINTH_OF_NOVEMBER_HALF_12 = 1447072200000

	def "Of date"()
	{
		setup:
		Instant t = Instant.ofEpochMilli(NINTH_OF_NOVEMBER_HALF_12)

		when:
		LocalDate d = LocalDate.of(t)

		then:
		d.year == 2015
		d.month == Month.NOVEMBER
		d.dayOfMonth == 9
	}

	def "Of datetime"()
	{
		setup:
		Instant t = Instant.ofEpochMilli(NINTH_OF_NOVEMBER_HALF_12)

		when:
		LocalDateTime d = LocalDateTime.of(t)

		then:
		d.year == 2015
		d.month == Month.NOVEMBER
		d.dayOfMonth == 9

		d.hour == 12
		d.minute == 30
		d.second == 0
	}
}
